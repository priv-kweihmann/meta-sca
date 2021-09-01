SUMMARY = "NPM: cspell-glob"
DESCRIPTION = "Glob matcher for cspell"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/master/packages/cspell-glob#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-micromatch-native"

SRC_URI = "https://registry.npmjs.org/cspell-glob/-/cspell-glob-5.9.0.tgz"
SRC_URI[md5sum] = "bce47704d8224840293161facb5be3e1"
SRC_URI[sha256sum] = "f9f6b780fc6a669ee8b5d7f4b9aa3fd324b382cd5e9796074956cb76616b8348"

NPM_PKGNAME = "cspell-glob"

inherit npmhelper
inherit native
