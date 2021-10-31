SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for Stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d861e8124bf847dc7fe62d1122de2c04"

DEPENDS = "npm-stylelint-config-recommended-native"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-23.0.0.tgz"
SRC_URI[md5sum] = "2dd8ddcb5b80e8f9cb4a6d3a5b45d291"
SRC_URI[sha256sum] = "851d3d66fd5974d876b704a5527aa58a3eced1a4de2d8a142e005370041bd1ae"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
