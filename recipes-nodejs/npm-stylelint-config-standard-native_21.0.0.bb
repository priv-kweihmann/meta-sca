SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d861e8124bf847dc7fe62d1122de2c04"

DEPENDS = "npm-stylelint-config-recommended-native"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-21.0.0.tgz"
SRC_URI[md5sum] = "d036b4542aaafeae417482034902dfe8"
SRC_URI[sha256sum] = "575ed5ebf568feb4e74174fb1a282cfd156def023aa86ccf1258d9b93882cba3"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
