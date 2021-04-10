SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.8.0.tgz"
SRC_URI[md5sum] = "2794b19e277e525158cb89254145ebf1"
SRC_URI[sha256sum] = "17fabe99bd769dbbe56ce542248da2b98699f642b3dc88d2f618332d3e6ec8c4"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
