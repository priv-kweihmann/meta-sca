SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.7.0.tgz"
SRC_URI[md5sum] = "75c2ebe0d70a1bbdf1e15e64121f33c3"
SRC_URI[sha256sum] = "d8950f0737d4715c976878bb44b8f42e67e04b3d3a151bf93033dd8b8a22d698"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
