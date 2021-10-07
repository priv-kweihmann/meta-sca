SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.12.2.tgz"
SRC_URI[md5sum] = "4d88ab1c23ca318b01158efebc488635"
SRC_URI[sha256sum] = "757a4267f6b741e689ba7c3b049143bf9516c36729b46164ef3fd454d7b103d0"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
