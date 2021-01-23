SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-8.1.1.tgz"
SRC_URI[md5sum] = "16e8e38709a4675f8ea1482806cb050c"
SRC_URI[sha256sum] = "ea69d9b5801e109932f9f12b5499c06de3fde936119a21c5941b2759d4364fb0"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
