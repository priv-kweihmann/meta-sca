SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.3.8.tgz"
SRC_URI[md5sum] = "24202b76a082f8023c7933a882f820b5"
SRC_URI[sha256sum] = "bf4fafb16cfd5df16a4a983618a8e14093726682136ad485513dfb0f778e7541"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
