SUMMARY = "NPM: eslint-template-visitor"
DESCRIPTION = "[![Build Status](https://travis-ci.org/futpib/eslint-template-visitor.svg?branch=master)](https://travis-ci.org/futpib/eslint-template-visitor) [![Coverage Status](https://coveralls.io/repos/github/futpib/eslint-template-visitor/badge.svg?branch=master)]("
HOMEPAGE = "https://github.com/futpib/eslint-template-visitor#readme"

LICENSE = "GPL-3.0-or-later | MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-babel-eslint-parser-native \
           npm-eslint-visitor-keys-native \
           npm-esquery-native \
           npm-multimap-native"

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.3.0.tgz"
SRC_URI[md5sum] = "40b12fe2c48fb0aa20f0e606bec643ff"
SRC_URI[sha256sum] = "ee7587edbecedf92bfb14f740c016ec21a6e7fa9a7401b5abe1a77b902f0419c"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
