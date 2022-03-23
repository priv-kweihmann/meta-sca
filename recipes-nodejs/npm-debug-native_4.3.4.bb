SUMMARY = "NPM: debug"
DESCRIPTION = "Lightweight debugging utility for Node.js and the browser"
HOMEPAGE = "https://github.com/debug-js/debug#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.3.4.tgz"
SRC_URI[md5sum] = "356bb405c567d6744aae8a9d1cfe9008"
SRC_URI[sha256sum] = "04922c9b2e37a6858df2b870a278d1d3a8aaad7ec4c3bd84427f0d53cbf28bcf"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
