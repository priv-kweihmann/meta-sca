SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.15.1.tgz"
SRC_URI[md5sum] = "b501adacf6a0e832ed444fb495a6f0fb"
SRC_URI[sha256sum] = "353b1a8084cdbfb7ccd3fc701e68b557c0eb2c736f7199b120e96ca00cfd1bf7"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
