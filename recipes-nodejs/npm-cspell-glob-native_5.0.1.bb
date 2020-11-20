SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.0.1.tgz"
SRC_URI[md5sum] = "1106399be99a828336372d3558964330"
SRC_URI[sha256sum] = "f461266ea07e5fc229242f33b7cedb4185f5588ebd72dd15e5e554aa53547061"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
