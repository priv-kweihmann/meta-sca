SUMMARY = "NPM: cspell-dict-css"
DESCRIPTION = "CSS dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/css#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-css/-/cspell-dict-css-1.1.2.tgz"
SRC_URI[md5sum] = "f6eb278a4f734db188fe7861456ab41e"
SRC_URI[sha256sum] = "d356eefb740917229a49614ff636e34718f7805f7fb9f11d773fa96863c31d90"

NPM_PKGNAME = "cspell-dict-css"

inherit npmhelper
inherit native
