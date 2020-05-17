SUMMARY = "NPM: debug"
DESCRIPTION = "small debugging utility"
HOMEPAGE = "https://github.com/visionmedia/debug#readme"

DEPENDS = "npm-ms-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.1.1.tgz"
SRC_URI[md5sum] = "01ddc35a76b0e581407d4c53beb7d9f8"
SRC_URI[sha256sum] = "352b55e989119b5453643711c22dea04baa031f48e2f8aa7c5159cab6bf2f7c6"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
