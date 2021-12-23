SUMMARY = "NPM: wrap-ansi"
DESCRIPTION = "Wordwrap a string with ANSI escape codes"
HOMEPAGE = "https://github.com/chalk/wrap-ansi#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-ansi-styles-native \
           npm-string-width-native \
           npm-strip-ansi-native"

SRC_URI = "https://registry.npmjs.org/wrap-ansi/-/wrap-ansi-8.0.1.tgz"
SRC_URI[md5sum] = "f6574110fb4a9cfdf927015e9335fbe6"
SRC_URI[sha256sum] = "255c233d0938a60143cc556e8fe3b19a8382d18595ccbf2ab923942e99a6b9c7"

NPM_PKGNAME = "wrap-ansi"

inherit npmhelper
inherit native
