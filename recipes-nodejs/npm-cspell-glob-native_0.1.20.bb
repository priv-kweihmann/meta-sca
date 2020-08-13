SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-0.1.20.tgz"
SRC_URI[md5sum] = "a60485209c6d5db869eec4c9a6799bbc"
SRC_URI[sha256sum] = "3c03887e9f57c4ef39353a9dce9c45072c0d0b795bc06fd05b154896875afcda"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
