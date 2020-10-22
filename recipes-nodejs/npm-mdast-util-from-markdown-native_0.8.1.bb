SUMMARY = "NPM: mdast-util-from-markdown"
DESCRIPTION = "mdast utility to parse markdown"
HOMEPAGE = "https://github.com/syntax-tree/mdast-util-from-markdown#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-mdast-util-to-string-native \
           npm-micromark-native \
           npm-parse-entities-native \
           npm-types-mdast-native"

SRC_URI = "https://registry.npmjs.org/mdast-util-from-markdown/-/mdast-util-from-markdown-0.8.1.tgz"
SRC_URI[md5sum] = "53b4c4cb8dec52d1baef597f11581302"
SRC_URI[sha256sum] = "02e83e1ce6e99002aef928cd1561dde7ad3392781822d15d51a396e02e3a0a89"

NPM_PKGNAME = "mdast-util-from-markdown"

inherit npmhelper
inherit native
