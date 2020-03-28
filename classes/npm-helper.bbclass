## SPDX-License-Identifier: BSD-2-Clause & MIT
## Copyright (c) 2019, Konrad Weihmann + OpenEmbedded

NPM_TAR_FILENAME = "modules_${BPN}-${PV}.tar.gz"
NPM_LIBDIR ?= "${D}${libdir}"
# Use --prefer-offline as some packages don't work with full --offline mode
# this works around the 'only-if-cached' issue of npm and some pkgs
NPM_EXTRA_ARGS = "--prefer-offline --no-registry"

NPM_EXTRA_ARGS[vardepvalue] = "foo"

# This function is originated from poky's npm.bbclass
def npm_oe_arch_map(target_arch, d):
    import re
    if   re.match('p(pc|owerpc)(|64)', target_arch): return 'ppc'
    elif re.match('i.86$', target_arch): return 'ia32'
    elif re.match('x86_64$', target_arch): return 'x64'
    elif re.match('arm64$', target_arch): return 'arm'
    return target_arch

NPM_ARCH ?= "${@npm_oe_arch_map(d.getVar('TARGET_ARCH'), d)}"

python __anonymous() {
    import os
    import subprocess

    found = False
    for _dir in d.getVar("FILESPATH").split(":"):
        if os.path.exists(os.path.join(_dir, d.getVar("NPM_TAR_FILENAME"))):
            if os.stat(os.path.join(_dir, d.getVar("NPM_TAR_FILENAME"))).st_size != 0:
                found = True
                break
    if not found:
        d.setVar("NPM_EXTRA_ARGS", "--package-lock")
        for _dir in d.getVar("FILESPATH").split(":"):
            if os.path.exists(_dir):
                try:
                    subprocess.check_call(["tar", 
                                            "cvzf", 
                                            os.path.join(_dir, d.getVar("NPM_TAR_FILENAME")),
                                            "-T", "/dev/null"])
                except subprocess.CalledProcessError as e:
                    bb.error(str(e))
                break
}

# This function do create a dump of all
# dependencies into a tarball
python do_package_refresh() {
    import os
    import subprocess

    for _dir in d.getVar("FILESPATH").split(":"):
        if os.path.exists(_dir):
            try:
                subprocess.check_call(["tar", 
                                       "cvzf", 
                                       os.path.join(_dir, d.getVar("NPM_TAR_FILENAME")),
                                       "-C", d.getVar("NPM_LIBDIR"),
                                       "node_modules"])
            except subprocess.CalledProcessError as e:
                bb.error(str(e))
            break;
}
## Requires install
do_package_refresh[depends] += "${PN}:do_install"
do_package_refresh[doc] = "Create tarball with pre-fetched dependencies"
addtask do_package_refresh