SUMMARY = "NPM: debug"
DESCRIPTION = "small debugging utility"
HOMEPAGE = "https://github.com/visionmedia/debug#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.2.0.tgz"
SRC_URI[md5sum] = "99a1fec8431f0d1fe1275677496b5ce9"
SRC_URI[sha256sum] = "49cba694b68e4a4d94e9e921ac858f2ca0fee71726552f9e1b3a757e3360e690"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
