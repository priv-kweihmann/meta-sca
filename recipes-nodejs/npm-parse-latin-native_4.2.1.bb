SUMMARY = "NPM: parse-latin"
DESCRIPTION = "Latin-script (natural language) parser"
HOMEPAGE = "https://github.com/wooorm/parse-latin#readme"

DEPENDS = "npm-nlcst-to-string-native npm-unist-util-modify-children-native npm-unist-util-visit-children-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=f94eeeb01d2350e09cda730abca93641"

SRC_URI = "https://registry.npmjs.org/parse-latin/-/parse-latin-4.2.1.tgz"
SRC_URI[md5sum] = "c3e9701545159a8f83ccca9e4ae97eb3"
SRC_URI[sha256sum] = "8aa9fc4b4880aa5c1c188cb66a9db52ab9bc86c974d89f057ff9d40f6415fea6"

NPM_PKGNAME = "parse-latin"

inherit npmhelper
inherit native
