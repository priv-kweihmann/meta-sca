SUMMARY = "NPM: eslint-template-visitor"
DESCRIPTION = "[![Build Status](https://travis-ci.org/futpib/eslint-template-visitor.svg?branch=master)](https://travis-ci.org/futpib/eslint-template-visitor) [![Coverage Status](https://coveralls.io/repos/github/futpib/eslint-template-visitor/badge.svg?branch=master)]("
HOMEPAGE = "https://github.com/futpib/eslint-template-visitor#readme"

LICENSE = "GPL-3.0-or-later | MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-babel-eslint-native \
           npm-eslint-visitor-keys-native \
           npm-esquery-native \
           npm-multimap-native"

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.2.0.tgz"
SRC_URI[md5sum] = "ddf854427e11da1f00b02b4965dc042a"
SRC_URI[sha256sum] = "f74187a331982dc4333bceee127f3be6c4f6434f3c9d9f1164210103fc702404"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
