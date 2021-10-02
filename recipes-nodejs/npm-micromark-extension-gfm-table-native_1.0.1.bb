SUMMARY = "NPM: micromark-extension-gfm-table"
DESCRIPTION = "micromark extension to support GFM tables"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-power-assert-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.1.tgz"
SRC_URI[md5sum] = "be0cf6683b5a93c6bc1a84038b4ac99f"
SRC_URI[sha256sum] = "4447bda9a92a7c73fdd1b001413486b6e17a88bdfd57d00d0138c485262d6937"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
