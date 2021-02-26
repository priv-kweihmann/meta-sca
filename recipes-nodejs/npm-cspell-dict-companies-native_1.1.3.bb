SUMMARY = "NPM: cspell-dict-companies"
DESCRIPTION = "Company names dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/companies#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-companies/-/cspell-dict-companies-1.1.3.tgz"
SRC_URI[md5sum] = "a343a6c5d153c90ddf1910078b58ade7"
SRC_URI[sha256sum] = "0a1027a0a66687b7b65a982f41e930181cbd05af6df3b19314f2f1fb96192243"

NPM_PKGNAME = "cspell-dict-companies"

inherit npmhelper
inherit native
