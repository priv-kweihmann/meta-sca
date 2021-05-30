SUMMARY = "NPM: supports-color"
DESCRIPTION = "Detect whether a terminal supports color"
HOMEPAGE = "https://github.com/chalk/supports-color#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-has-flag-native"

SRC_URI = "https://registry.npmjs.org/supports-color/-/supports-color-9.0.1.tgz"
SRC_URI[md5sum] = "6981926d031d172570c3cd2dcd1b7452"
SRC_URI[sha256sum] = "5833e8ff93139e6f9fb34acd3b5702b70066eadef53023eb35011d224041187d"

NPM_PKGNAME = "supports-color"

inherit npmhelper
inherit native
