SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for Stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d861e8124bf847dc7fe62d1122de2c04"

DEPENDS = "npm-stylelint-config-recommended-native"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-25.0.0.tgz"
SRC_URI[md5sum] = "2b8c003b154427a3acb8a0ce80d2398c"
SRC_URI[sha256sum] = "e7efbbb603466fe504190dfea31ac33a59406351fa9563dfe68b8e0d2719dc9c"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
