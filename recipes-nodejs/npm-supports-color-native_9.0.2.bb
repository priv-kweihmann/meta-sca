SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.0.2.tgz"
SRC_URI[md5sum] = "1e2fd62cd84bf8901177856af421a27c"
SRC_URI[sha256sum] = "7070312f5f4d99cb94c858d147adf0dd98e453f62a917f8b99f7758593152f95"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
