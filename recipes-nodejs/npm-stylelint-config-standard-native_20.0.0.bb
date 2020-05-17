SUMMARY = "NPM: stylelint-config-standard"
DESCRIPTION = "Standard shareable config for stylelint"
HOMEPAGE = "https://github.com/stylelint/stylelint-config-standard#readme"

DEPENDS = "npm-stylelint-config-recommended-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8468c4c16e0bfa1421c72577526796af"

SRC_URI = "https://registry.npmjs.org/stylelint-config-standard/-/stylelint-config-standard-20.0.0.tgz"
SRC_URI[md5sum] = "1725cf3b01b765ede502434f9d79210e"
SRC_URI[sha256sum] = "319be7098308a54e59148bd874eb97a25febf0b33c677d88b4adb87884720d79"

NPM_PKGNAME = "stylelint-config-standard"

inherit npmhelper
inherit native
