SUMMARY = "NPM: cspell-dict-golang"
DESCRIPTION = "Go Language dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/golang#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd6ca8d8865d18c1a5a6696c0f841ff0"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-golang/-/cspell-dict-golang-1.1.15.tgz"
SRC_URI[md5sum] = "837cf45cb142cacf3a5ed2d7b672ec33"
SRC_URI[sha256sum] = "55fcd3879081798c15cc1b67b55964e246208ebac351df2d389a282319e4c15d"

NPM_PKGNAME = "cspell-dict-golang"

inherit npmhelper
inherit native
