SUMMARY = "NPM: eslint-template-visitor"
DESCRIPTION = "[![Build Status](https://travis-ci.org/futpib/eslint-template-visitor.svg?branch=master)](https://travis-ci.org/futpib/eslint-template-visitor) [![Coverage Status](https://coveralls.io/repos/github/futpib/eslint-template-visitor/badge.svg?branch=master)]("
HOMEPAGE = "https://github.com/futpib/eslint-template-visitor#readme"

LICENSE = "GPL-3.0-or-later | MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-babel-core-native \
           npm-babel-eslint-parser-native \
           npm-eslint-visitor-keys-native \
           npm-esquery-native \
           npm-multimap-native"

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.3.2.tgz"
SRC_URI[md5sum] = "783164c6b20842ebc4504a19905cac4b"
SRC_URI[sha256sum] = "02afe6a3f6af9b0e8581b0276dd14ac3bc4ec45111306bfdb94b0afcc70e3127"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
