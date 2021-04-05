SUMMARY = "NPM: parse-latin"
DESCRIPTION = "Latin-script (natural language) parser"
HOMEPAGE = "https://github.com/wooorm/parse-latin#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-nlcst-to-string-native \
           npm-unist-util-modify-children-native \
           npm-unist-util-visit-children-native"

SRC_URI = "https://registry.npmjs.org/parse-latin/-/parse-latin-5.0.0.tgz"
SRC_URI[md5sum] = "4f39ceaf1d37d2f0307a86b17144cd0a"
SRC_URI[sha256sum] = "1c793bb699a13d8dc9570a49935e5c07d867b77c01f9b6a3febacd3830498514"

NPM_PKGNAME = "parse-latin"

inherit npmhelper
inherit native
