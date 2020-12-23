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

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.2.2.tgz"
SRC_URI[md5sum] = "c6e7cb163f27a2162fee064b69a88a55"
SRC_URI[sha256sum] = "22be335d8f444f1ef09f4ccb0cc83cb327e79e81289c916188c12f98230b8457"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
