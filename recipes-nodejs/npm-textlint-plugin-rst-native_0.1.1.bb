SUMMARY = "NPM: textlint-plugin-rst"
DESCRIPTION = "reStructuredText support for textlint"
DEPENDS = "npm-debug-native npm-structured-source-native npm-traverse-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=2d8734ecfbfadcc8766ec274ecbd569e"

SRC_URI = "https://registry.npmjs.org/textlint-plugin-rst/-/textlint-plugin-rst-0.1.1.tgz"
SRC_URI[md5sum] = "408b20420cab64d8530ad30d655e13cb"
SRC_URI[sha256sum] = "231776b66cf7d929c9257aff101c9474ed859bd36ce2188b279700236ced3291"

NPM_PKGNAME = "textlint-plugin-rst"

inherit npmhelper
inherit native
