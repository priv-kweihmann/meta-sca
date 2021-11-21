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

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.4.tgz"
SRC_URI[md5sum] = "475f0135314f04fe3e1eb8e6e4dbdc3a"
SRC_URI[sha256sum] = "225d3ebf47321a28973d46d9ddf4b2ffcb7260d11ffa22c56c65ac016dde63e7"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
