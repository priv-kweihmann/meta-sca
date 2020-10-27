SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.3.0.tgz"
SRC_URI[md5sum] = "346252351ce1b89fe403f29a3684d9ec"
SRC_URI[sha256sum] = "c8d85e81c5c6557e1f4b48f1dc4b245beb81a4db32f38a77a8ce3f5eec3f243a"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
