SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-debug-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-2.11.3.tgz"
SRC_URI[md5sum] = "0dfaa7aafff8f3ead781c120899e9da4"
SRC_URI[sha256sum] = "c81f8947f4d4a0a7733430641be32f42731f66ff59957a1e5868875de1cc9025"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native
