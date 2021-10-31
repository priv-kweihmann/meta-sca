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

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.3.tgz"
SRC_URI[md5sum] = "374995db78debbaeb89f31ffb3667849"
SRC_URI[sha256sum] = "cda7086faf2591ddae4486b7d610a4f09e76ece271432e32ade836d60536c23f"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
