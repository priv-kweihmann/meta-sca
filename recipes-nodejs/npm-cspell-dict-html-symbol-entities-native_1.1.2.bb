SUMMARY = "NPM: cspell-dict-html-symbol-entities"
DESCRIPTION = "Html Symbol Entities dictionary for cspell."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell-dicts/blob/master/packages/html-symbol-entities#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=62f84db3eea2ff0da5510fedd081ea0c"

DEPENDS = "npm-configstore-native"

SRC_URI = "https://registry.npmjs.org/cspell-dict-html-symbol-entities/-/cspell-dict-html-symbol-entities-1.1.2.tgz"
SRC_URI[md5sum] = "7828fd8c2380ef74842e7b902bfb2fb7"
SRC_URI[sha256sum] = "0dc180cbe990ce98baa06416dbf78a0aaab3e8c13bf2d7fa1fdd4392d9bf4bbe"

NPM_PKGNAME = "cspell-dict-html-symbol-entities"

inherit npmhelper
inherit native
