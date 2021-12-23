SUMMARY = "NPM: debug"
DESCRIPTION = "Lightweight debugging utility for Node.js and the browser"
HOMEPAGE = "https://github.com/debug-js/debug#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d85a365580888e9ee0a01fb53e8e9bf0"

DEPENDS = "npm-ms-native"

SRC_URI = "https://registry.npmjs.org/debug/-/debug-4.3.3.tgz"
SRC_URI[md5sum] = "e0e3067fdf8e98f4d817683191280e8e"
SRC_URI[sha256sum] = "5fa9d542c65bca3df3a7445581b62a7c61b25dd11fe6f79a1b9b29236cafcced"

NPM_PKGNAME = "debug"

inherit npmhelper
inherit native
