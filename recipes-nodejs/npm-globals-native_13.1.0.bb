SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.1.0.tgz"
SRC_URI[md5sum] = "64bf1e9b100439bf5a8907eeacd34be2"
SRC_URI[sha256sum] = "28ede1914f8baa6215dcb79fd8017cc5ceb081abbe1ab8a25e48e042ae56cbd7"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
