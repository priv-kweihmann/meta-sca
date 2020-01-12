# This is a copy of the emit_pkgdata function
# from package.bbclass of poky
# published under the following terms and conditions
# 
# Permission is hereby granted, free of charge, to any person obtaining a copy 
# of this software and associated documentation files (the "Software"), to deal 
# in the Software without restriction, including without limitation the rights 
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
# copies of the Software, and to permit persons to whom the Software is 
# furnished to do so, subject to the following conditions:

# The above copyright notice and this permission notice shall be included in 
# all copies or substantial portions of the Software.

# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
# THE SOFTWARE. 
# 
# Out of unknown reasons it happens from time to time
# that __pycache__-files from the any package gets lost between
# install and package
# The core issue is around the usage
# of python3-manifest.json via an anonymous python funtions
# being mapped to PACKAGES/FILES.
# So the real solution needs to be patched in poky itself.
# This hotfix does only ignore any errors like
#
# Exception: FileNotFoundError: [Errno 2] 
#     No such file or directory: '...usr/lib/python3.7/distutils/tests/__pycache__/test_clean.cpython-37.pyc'

python emit_pkgdata() {
    from glob import glob
    import json

    bb.note("Running emit_pkgdata hotfix")

    def process_postinst_on_target(pkg, mlprefix):
        defer_fragment = """
if [ -n "$D" ]; then
    $INTERCEPT_DIR/postinst_intercept delay_to_first_boot %s mlprefix=%s
    exit 0
fi
""" % (pkg, mlprefix)

        postinst = d.getVar('pkg_postinst_%s' % pkg)
        postinst_ontarget = d.getVar('pkg_postinst_ontarget_%s' % pkg)

        if postinst_ontarget:
            bb.debug(1, 'adding deferred pkg_postinst_ontarget() to pkg_postinst() for %s' % pkg)
            if not postinst:
                postinst = '#!/bin/sh\n'
            postinst += defer_fragment
            postinst += postinst_ontarget
            d.setVar('pkg_postinst_%s' % pkg, postinst)

    def add_set_e_to_scriptlets(pkg):
        for scriptlet_name in ('pkg_preinst', 'pkg_postinst', 'pkg_prerm', 'pkg_postrm'):
            scriptlet = d.getVar('%s_%s' % (scriptlet_name, pkg))
            if scriptlet:
                scriptlet_split = scriptlet.split('\n')
                if scriptlet_split[0].startswith("#!"):
                    scriptlet = scriptlet_split[0] + "\nset -e\n" + "\n".join(scriptlet_split[1:])
                else:
                    scriptlet = "set -e\n" + "\n".join(scriptlet_split[0:])
            d.setVar('%s_%s' % (scriptlet_name, pkg), scriptlet)

    def write_if_exists(f, pkg, var):
        def encode(str):
            import codecs
            c = codecs.getencoder("unicode_escape")
            return c(str)[0].decode("latin1")

        val = d.getVar('%s_%s' % (var, pkg))
        if val:
            f.write('%s_%s: %s\n' % (var, pkg, encode(val)))
            return val
        val = d.getVar('%s' % (var))
        if val:
            f.write('%s: %s\n' % (var, encode(val)))
        return val

    def write_extra_pkgs(variants, pn, packages, pkgdatadir):
        for variant in variants:
            with open("%s/%s-%s" % (pkgdatadir, variant, pn), 'w') as fd:
                fd.write("PACKAGES: %s\n" % ' '.join(
                            map(lambda pkg: '%s-%s' % (variant, pkg), packages.split())))

    def write_extra_runtime_pkgs(variants, packages, pkgdatadir):
        for variant in variants:
            for pkg in packages.split():
                ml_pkg = "%s-%s" % (variant, pkg)
                subdata_file = "%s/runtime/%s" % (pkgdatadir, ml_pkg)
                with open(subdata_file, 'w') as fd:
                    fd.write("PKG_%s: %s" % (ml_pkg, pkg))

    packages = d.getVar('PACKAGES')
    pkgdest = d.getVar('PKGDEST')
    pkgdatadir = d.getVar('PKGDESTWORK')

    data_file = pkgdatadir + d.expand("/${PN}" )
    f = open(data_file, 'w')
    f.write("PACKAGES: %s\n" % packages)
    f.close()

    pn = d.getVar('PN')
    global_variants = (d.getVar('MULTILIB_GLOBAL_VARIANTS') or "").split()
    variants = (d.getVar('MULTILIB_VARIANTS') or "").split()

    if bb.data.inherits_class('kernel', d) or bb.data.inherits_class('module-base', d):
        write_extra_pkgs(variants, pn, packages, pkgdatadir)

    if bb.data.inherits_class('allarch', d) and not variants \
        and not bb.data.inherits_class('packagegroup', d):
        write_extra_pkgs(global_variants, pn, packages, pkgdatadir)

    workdir = d.getVar('WORKDIR')

    for pkg in packages.split():
        pkgval = d.getVar('PKG_%s' % pkg)
        if pkgval is None:
            pkgval = pkg
            d.setVar('PKG_%s' % pkg, pkg)

        pkgdestpkg = os.path.join(pkgdest, pkg)
        files = {}
        total_size = 0
        seen = set()
        for f in pkgfiles[pkg]:
            relpth = os.path.relpath(f, pkgdestpkg)
            try:
                fstat = os.lstat(f)
                files[os.sep + relpth] = fstat.st_size
                if fstat.st_ino not in seen:
                    seen.add(fstat.st_ino)
                    total_size += fstat.st_size
            except FileNotFoundError as e:
                bb.warn(str(e))
        d.setVar('FILES_INFO', json.dumps(files))

        subdata_file = pkgdatadir + "/runtime/%s" % pkg
        sf = open(subdata_file, 'w')
        write_if_exists(sf, pkg, 'PN')
        write_if_exists(sf, pkg, 'PE')
        write_if_exists(sf, pkg, 'PV')
        write_if_exists(sf, pkg, 'PR')
        write_if_exists(sf, pkg, 'PKGE')
        write_if_exists(sf, pkg, 'PKGV')
        write_if_exists(sf, pkg, 'PKGR')
        write_if_exists(sf, pkg, 'LICENSE')
        write_if_exists(sf, pkg, 'DESCRIPTION')
        write_if_exists(sf, pkg, 'SUMMARY')
        write_if_exists(sf, pkg, 'RDEPENDS')
        rprov = write_if_exists(sf, pkg, 'RPROVIDES')
        write_if_exists(sf, pkg, 'RRECOMMENDS')
        write_if_exists(sf, pkg, 'RSUGGESTS')
        write_if_exists(sf, pkg, 'RREPLACES')
        write_if_exists(sf, pkg, 'RCONFLICTS')
        write_if_exists(sf, pkg, 'SECTION')
        write_if_exists(sf, pkg, 'PKG')
        write_if_exists(sf, pkg, 'ALLOW_EMPTY')
        write_if_exists(sf, pkg, 'FILES')
        write_if_exists(sf, pkg, 'CONFFILES')
        process_postinst_on_target(pkg, d.getVar("MLPREFIX"))
        add_set_e_to_scriptlets(pkg)
        write_if_exists(sf, pkg, 'pkg_postinst')
        write_if_exists(sf, pkg, 'pkg_postrm')
        write_if_exists(sf, pkg, 'pkg_preinst')
        write_if_exists(sf, pkg, 'pkg_prerm')
        write_if_exists(sf, pkg, 'FILERPROVIDESFLIST')
        write_if_exists(sf, pkg, 'FILES_INFO')
        for dfile in (d.getVar('FILERPROVIDESFLIST_' + pkg) or "").split():
            write_if_exists(sf, pkg, 'FILERPROVIDES_' + dfile)

        write_if_exists(sf, pkg, 'FILERDEPENDSFLIST')
        for dfile in (d.getVar('FILERDEPENDSFLIST_' + pkg) or "").split():
            write_if_exists(sf, pkg, 'FILERDEPENDS_' + dfile)

        sf.write('%s_%s: %d\n' % ('PKGSIZE', pkg, total_size))
        sf.close()

        # Symlinks needed for rprovides lookup
        if rprov:
            for p in rprov.strip().split():
                subdata_sym = pkgdatadir + "/runtime-rprovides/%s/%s" % (p, pkg)
                bb.utils.mkdirhier(os.path.dirname(subdata_sym))
                oe.path.symlink("../../runtime/%s" % pkg, subdata_sym, True)

        allow_empty = d.getVar('ALLOW_EMPTY_%s' % pkg)
        if not allow_empty:
            allow_empty = d.getVar('ALLOW_EMPTY')
        root = "%s/%s" % (pkgdest, pkg)
        os.chdir(root)
        g = glob('*')
        if g or allow_empty == "1":
            # Symlinks needed for reverse lookups (from the final package name)
            subdata_sym = pkgdatadir + "/runtime-reverse/%s" % pkgval
            oe.path.symlink("../runtime/%s" % pkg, subdata_sym, True)

            packagedfile = pkgdatadir + '/runtime/%s.packaged' % pkg
            open(packagedfile, 'w').close()

    if bb.data.inherits_class('kernel', d) or bb.data.inherits_class('module-base', d):
        write_extra_runtime_pkgs(variants, packages, pkgdatadir)

    if bb.data.inherits_class('allarch', d) and not variants \
        and not bb.data.inherits_class('packagegroup', d):
        write_extra_runtime_pkgs(global_variants, packages, pkgdatadir)

}
