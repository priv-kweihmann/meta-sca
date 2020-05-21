SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.0.0.tgz"
SRC_URI[md5sum] = "3dabc49cc7df2187d65dd55d18d819c3"
SRC_URI[sha256sum] = "aa7f46d209c31c18ca849872bcbb61e9095a13ede831e738d5900e7008fc89e3"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
