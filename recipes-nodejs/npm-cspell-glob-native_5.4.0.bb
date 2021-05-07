SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.4.0.tgz"
SRC_URI[md5sum] = "64b43e2197db69e0f999757a61566ce0"
SRC_URI[sha256sum] = "d8528e6c0c73789bb12f07f063159d4dedc5f2dce5772d3a6ab86757306f8a8d"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
