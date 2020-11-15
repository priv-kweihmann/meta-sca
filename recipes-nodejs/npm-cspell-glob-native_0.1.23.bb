SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.23.tgz"
SRC_URI[md5sum] = "7c4c1fb1d0b4d1964da50ccc130fe5a4"
SRC_URI[sha256sum] = "2a84d0efc2f79d085fc259714efeee100bca366da017d9dc80a8524411f81a65"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
