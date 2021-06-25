SUMMARY = "NPM: micromark-extension-gfm-table"
DESCRIPTION = "micromark extension to support GFM tables"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.0.tgz"
SRC_URI[md5sum] = "e32f07f426df52fe1c4bcd52a21c866b"
SRC_URI[sha256sum] = "0b01533ffebb418cd1d253a35ba200bd871cd2051c8e123c75f9d120e49570f6"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
