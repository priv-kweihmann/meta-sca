SUMMARY = "NPM: micromark-extension-gfm-table"
DESCRIPTION = "micromark extension to support GFM tables"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-table#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-factory-space-native \
           npm-micromark-util-character-native \
           npm-micromark-util-symbol-native \
           npm-micromark-util-types-native \
           npm-uvu-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-1.0.5.tgz"
SRC_URI[md5sum] = "e1b394e65621efddba58f5a8df725a2c"
SRC_URI[sha256sum] = "7fbdff147b72dcaa40314e27854113346d5b18ed109053081c5fcf429bb3db46"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
