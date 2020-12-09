SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.4.0.tgz"
SRC_URI[md5sum] = "36ea4d8e16f8a7bde4d1ef806cabff72"
SRC_URI[sha256sum] = "e457e194b739b6a5539d032459151465ebb380ad9285e35c2210296bcec3249e"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
