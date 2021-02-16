SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.6.0.tgz"
SRC_URI[md5sum] = "e96dff876f77192312bc1c3aa5d64429"
SRC_URI[sha256sum] = "2fe664f4f15962bcec383b23972976a114ebaf2ef840a2b2a60e39904bac2d38"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
