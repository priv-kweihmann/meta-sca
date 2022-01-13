## SPDX-License-Identifier: BSD-2-Clause & MIT
## Copyright (c) 2020, Konrad Weihmann + OpenEmbedded

DEPENDS += "nodejs-native"

NPM_LIBDIR ?= "${D}${libdir}"
NPM_EXTRA_ARGS = "--prefer-offline --no-registry"
NPM_PKGNAME ?= "${BPN}"

S = "${WORKDIR}/package"
B = "${WORKDIR}/build"

def clean_npm_pkgname(name):
    for k,v in {"@": "", "/": "-", "_": "-"}.items():
        name = name.replace(k,v)
    return name

NPM_PKGNAME_CLEAN = "${@clean_npm_pkgname(d.getVar('NPM_PKGNAME'))}"

def clean_npm_pkgname_regex(name):
    import re
    return re.escape(name)

UPSTREAM_CHECK_URI ?= "https://www.npmjs.com/package/${NPM_PKGNAME}?activeTab=versions"
UPSTREAM_CHECK_REGEX ?= "${@clean_npm_pkgname_regex(d.getVar('NPM_PKGNAME'))}/v/(?P<pver>(\d+\.\d+\.\d+))$"

# This function is originated from poky's npm.bbclass
def npm_oe_arch_map(target_arch, d):
    import re
    if   re.match('p(pc|owerpc)(|64)', target_arch): return 'ppc'
    elif re.match('i.86$', target_arch): return 'ia32'
    elif re.match('x86_64$', target_arch): return 'x64'
    elif re.match('arm64$', target_arch): return 'arm'
    return target_arch

NPM_ARCH ?= "${@npm_oe_arch_map(d.getVar('TARGET_ARCH'), d)}"

# FIXME -> find out why devshell isn't working
#do_install[depends] += "${PN}:do_devshell"

npmhelper_do_install() {
    export HOME=${S}
    cd ${WORKDIR}
        tar -zcvf ${B}/${NPM_PKGNAME_CLEAN}-${PV}.tgz $(basename ${S})
    cd -
    install -d ${D}${libdir}/node_modules
    npm install --prefix ${D}${prefix} -g ${NPM_EXTRA_ARGS} --arch=${NPM_ARCH} --target_arch=${NPM_ARCH} --production ${B}/${NPM_PKGNAME_CLEAN}-${PV}.tgz
}
npmhelper_do_install[network] = "1"
do_install[network] = "1"

EXPORT_FUNCTIONS do_install
