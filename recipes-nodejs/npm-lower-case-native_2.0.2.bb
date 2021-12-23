SUMMARY = "NPM: lower-case"
DESCRIPTION = "Transforms the string to lower case"
HOMEPAGE = "https://github.com/blakeembrey/change-case/tree/master/packages/lower-case#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=44088ba57cb871a58add36ce51b8de08"

DEPENDS = "npm-tslib-native"

SRC_URI = "https://registry.npmjs.org/lower-case/-/lower-case-2.0.2.tgz"
SRC_URI[md5sum] = "6a8abf7f1de0ef6a2adb109ddd76e2d5"
SRC_URI[sha256sum] = "5e45966cdfff196b6411301b24fdaae16429164be5f47a634462ee0b949ef031"

NPM_PKGNAME = "lower-case"

inherit npmhelper
inherit native
