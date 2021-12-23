SUMMARY = "NPM: is-js-type"
DESCRIPTION = "Is string a JS Type"
HOMEPAGE = "https://github.com/dustinspecker/is-js-type#readme"

DEPENDS = "npm-js-types-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

SRC_URI = "https://registry.npmjs.org/is-js-type/-/is-js-type-2.0.0.tgz"
SRC_URI[md5sum] = "89c1378f5a53fec687827f000e40d29b"
SRC_URI[sha256sum] = "f3ec1367ed9ec52732c0deba6bbb00f5a6759ea7ae8925d224f7a489c938c57e"

NPM_PKGNAME = "is-js-type"

inherit npmhelper
inherit native
