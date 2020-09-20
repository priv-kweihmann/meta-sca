SUMMARY = "NPM: debug"
DESCRIPTION = "small debugging utility"
HOMEPAGE = "https://github.com/visionmedia/debug#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ddd815a475e7338b0be7a14d8ee35a99"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.3.0.tgz"
SRC_URI[md5sum] = "0105b8d3f732c672643a6cc61a90fd78"
SRC_URI[sha256sum] = "11909f8a2cbc10130a00d85627948fc42754d88981cc5fe67d30bdd8e2f0b1b9"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
