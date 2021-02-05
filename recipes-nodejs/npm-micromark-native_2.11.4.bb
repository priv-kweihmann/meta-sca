SUMMARY = "NPM: micromark"
DESCRIPTION = "small commonmark compliant markdown parser with positional info and concrete tokens"
HOMEPAGE = "https://github.com/micromark/micromark#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-debug-native \
           npm-parse-entities-native"

SRC_URI = "https://registry.npmjs.org/micromark/-/micromark-2.11.4.tgz"
SRC_URI[md5sum] = "e34fa62bc915077bff9a4973317beb06"
SRC_URI[sha256sum] = "45d95b57f9d9c4353c19c672a32c432020e35e09459cdade51a9abde96936db7"

NPM_PKGNAME = "micromark"

inherit npmhelper
inherit native
