SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.12.6.tgz"
SRC_URI[md5sum] = "0fcbe0ee89c35c23f9c3b27b3d93f774"
SRC_URI[sha256sum] = "cbd3aa87751093bc8651333b2d51a5727e0f5497d8291d043dcc49485a17f261"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
