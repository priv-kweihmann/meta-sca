SUMMARY = "NPM: micromark-extension-gfm-table"
DESCRIPTION = "micromark extension to support GFM tables"
HOMEPAGE = "https://github.com/micromark/micromark-extension-gfm-table#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=6a9c614ad8a32fcd51b47e458d620e48"

DEPENDS = "npm-micromark-native"

SRC_URI = "https://registry.npmjs.org/micromark-extension-gfm-table/-/micromark-extension-gfm-table-0.4.3.tgz"
SRC_URI[md5sum] = "73f766f879447e80438b480561450ff3"
SRC_URI[sha256sum] = "0db609a7c236b9722199dd1d2550538a11626c8509ec157d9aa4c5e38a6044a5"

NPM_PKGNAME = "micromark-extension-gfm-table"

inherit npmhelper
inherit native
