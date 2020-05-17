SUMMARY = "NPM: parse-english"
DESCRIPTION = "English natural language parser"
HOMEPAGE = "https://github.com/wooorm/parse-english#readme"

DEPENDS = "npm-nlcst-to-string-native npm-parse-latin-native npm-unist-util-modify-children-native npm-unist-util-visit-children-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

SRC_URI = "https://registry.npmjs.org/parse-english/-/parse-english-4.1.3.tgz"
SRC_URI[md5sum] = "93511f85991fcb7924ace8ff83dde40e"
SRC_URI[sha256sum] = "2de50a394c01a980727a7ac18f0046c15d03c661e1e1641b880d5da23751f9eb"

NPM_PKGNAME = "parse-english"

inherit npmhelper
inherit native
