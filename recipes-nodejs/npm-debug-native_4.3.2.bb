SUMMARY = "NPM: debug"
DESCRIPTION = "small debugging utility"
HOMEPAGE = "https://github.com/visionmedia/debug#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.3.2.tgz"
SRC_URI[md5sum] = "e6cb523b95d83bb1d087255046eb4d0b"
SRC_URI[sha256sum] = "06b5b98471dc02410003e8bf34cf9e96afbadc30a83b19f5c9376faa817fa7bb"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
