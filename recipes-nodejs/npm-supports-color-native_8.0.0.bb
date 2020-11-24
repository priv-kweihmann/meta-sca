SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-8.0.0.tgz"
SRC_URI[md5sum] = "170239cd546c7241f908decf02ceb0bd"
SRC_URI[sha256sum] = "db897737c10977aead8ee95fee47e5785f83207e44568a192dfa14e9aefbe476"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
