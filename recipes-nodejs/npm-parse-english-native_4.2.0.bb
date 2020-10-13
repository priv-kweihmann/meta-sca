SUMMARY = "NPM: parse-english"
DESCRIPTION = "English natural language parser"
HOMEPAGE = "https://github.com/wooorm/parse-english#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

DEPENDS = "npm-nlcst-to-string-native \
           npm-parse-latin-native \
           npm-unist-util-modify-children-native \
           npm-unist-util-visit-children-native"

SRC_URI = "https://registry.npmjs.org/parse-english/-/parse-english-4.2.0.tgz"
SRC_URI[md5sum] = "08d9020544c554012c8f75a42ee45b96"
SRC_URI[sha256sum] = "43fdb7913bd486e2ff8fcd9f23fb93edd70241f00403e5ba60f8fa1be02a3aac"

NPM_PKGNAME = "parse-english"

inherit npmhelper
inherit native
