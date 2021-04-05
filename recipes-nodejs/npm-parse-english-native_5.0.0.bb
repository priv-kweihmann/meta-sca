SUMMARY = "NPM: parse-english"
DESCRIPTION = "English natural language parser"
HOMEPAGE = "https://github.com/wooorm/parse-english#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-nlcst-to-string-native \
           npm-parse-latin-native \
           npm-unist-util-modify-children-native \
           npm-unist-util-visit-children-native"

SRC_URI = "https://registry.npmjs.org/parse-english/-/parse-english-5.0.0.tgz"
SRC_URI[md5sum] = "a4f8d5490ad94124025c860694524288"
SRC_URI[sha256sum] = "b1e9fd3ecf5a752cca4138da7cc048dbf0675ec60b72329c92252a75842f4f99"

NPM_PKGNAME = "parse-english"

inherit npmhelper
inherit native
