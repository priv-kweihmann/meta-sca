SUMMARY = "NPM: eslint-template-visitor"
DESCRIPTION = "[![Build Status](https://travis-ci.org/futpib/eslint-template-visitor.svg?branch=master)](https://travis-ci.org/futpib/eslint-template-visitor) [![Coverage Status](https://coveralls.io/repos/github/futpib/eslint-template-visitor/badge.svg?branch=master)]("
HOMEPAGE = "{homepage}"

LICENSE = "GPL-3.0 | MIT"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

DEPENDS = "npm-eslint-visitor-keys-native \
           npm-espree-native \
           npm-multimap-native"

SRC_URI = "https://registry.npmjs.org/eslint-template-visitor/-/eslint-template-visitor-2.0.0.tgz"
SRC_URI[md5sum] = "d3a25a7e01eb8bf5a0fffdf9c5ac349d"
SRC_URI[sha256sum] = "d9f59fb1b1432cab72ba5bc6aa8af591ba17e17ebce056d0c4cbf7819e5ba744"

NPM_PKGNAME = "eslint-template-visitor"

inherit npmhelper
inherit native
