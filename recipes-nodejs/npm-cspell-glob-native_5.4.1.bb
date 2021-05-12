SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.4.1.tgz"
SRC_URI[md5sum] = "e85f125406de525395d61478f71f0fa7"
SRC_URI[sha256sum] = "631943567f9089c03e9174146fe81a4be3156a23000f59f57156465ca024a8c0"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
