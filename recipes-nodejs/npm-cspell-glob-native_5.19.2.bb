SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-glob#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.19.2.tgz"
SRC_URI[md5sum] = "f0c3a27a0b823556835b6022a6dff45f"
SRC_URI[sha256sum] = "651e28fd69119ca4d833fdb61cffb79d503b7d0ee1a70ff7388c9bf514118360"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
