SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.11.0.tgz"
SRC_URI[md5sum] = "6e6af0b4d9d2d100641b83112d9b391b"
SRC_URI[sha256sum] = "a8685a008f826dc32e2f38b360edab19b47edfb3b6ff9beadefa16b98e1edd94"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
