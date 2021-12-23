SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for Stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d861e8124bf847dc7fe62d1122de2c04"

DEPENDS = "npm-stylelint-config-recommended-native"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-24.0.0.tgz"
SRC_URI[md5sum] = "6def441c378df777f3440750abe973bd"
SRC_URI[sha256sum] = "521b793aedb224de68f839d173c22afd3ce8d2afc805379913da67e047ba31a8"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
