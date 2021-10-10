SUMMARY = "NPM: micromark-extension-gfm-table"
DESCRIPTION = "micromark extension to support GFM tables"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.2.tgz"
SRC_URI[md5sum] = "c46225182380f579961d75b4b39c9a16"
SRC_URI[sha256sum] = "be21c359e85100fc822d60b86c685b9bcbde8b0ced8c8d0c2033493911f36504"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
