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

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.2.1.tgz"
SRC_URI[md5sum] = "2ed9428494f682b0359d24b57c18e8ef"
SRC_URI[sha256sum] = "d0070febfabb8618b08484ccc784f9efca88037e47a264b94a6dc14bcc47d7a1"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
