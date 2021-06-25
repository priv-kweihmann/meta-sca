SUMMARY = "NPM: mdast-util-gfm-autolink-literal"
DESCRIPTION = "mdast extension to parse and serialize GFM autolink literals"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-gfm-autolink-literal#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-ccount-native \
           npm-mdast-util-find-and-replace-native \
           npm-micromark-util-character-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-gfm-autolink-literal/-/mdast-util-gfm-autolink-literal-1.0.0.tgz"
SRC_URI[md5sum] = "f25a186a51a276ac9338c1eea6ee3c1c"
SRC_URI[sha256sum] = "e4555188e0e3a7802953bf0dd5d70f8c23d3ccd803f2986cbb69aba5b8463684"

NPM_PKGNAME = "mdast-util-gfm-autolink-literal"

inherit npmhelper
inherit native
