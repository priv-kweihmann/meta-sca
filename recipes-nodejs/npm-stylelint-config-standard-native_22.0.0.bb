SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d861e8124bf847dc7fe62d1122de2c04"

DEPENDS = "npm-stylelint-config-recommended-native"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-22.0.0.tgz"
SRC_URI[md5sum] = "7804d861edebca33c529c7e25482ca2c"
SRC_URI[sha256sum] = "9326902902baed05f1e576f878a63b2901413049a587c41e5ef236e463530298"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
