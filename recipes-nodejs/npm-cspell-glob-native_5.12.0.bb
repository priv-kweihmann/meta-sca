SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.12.0.tgz"
SRC_URI[md5sum] = "a25ec4c835c354e39d2b55b308310f75"
SRC_URI[sha256sum] = "a6c7120ed6fe723abbfbf29b55ee575c171a775987eeee32734fc1dc3ea077b5"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
