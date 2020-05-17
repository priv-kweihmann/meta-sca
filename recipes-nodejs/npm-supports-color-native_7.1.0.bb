SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

DEPENDS = "npm-has-flag-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-7.1.0.tgz"
SRC_URI[md5sum] = "9c970973568605fe98c6c3321854f7ce"
SRC_URI[sha256sum] = "03790a3ec287836732318925931fffdae6efe090576d966b005cbc8a20eed880"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
