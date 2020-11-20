SUMMARY = "NPM: debug"
DESCRIPTION = "small debugging utility"
HOMEPAGE = "https://github.com/visionmedia/debug#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.3.1.tgz"
SRC_URI[md5sum] = "690937c36f84e02c3d67193c2b867b76"
SRC_URI[sha256sum] = "34ccfe056d27979867bc08e7449f3a2b1170e9d16591532d4202fb08eb39a38c"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
