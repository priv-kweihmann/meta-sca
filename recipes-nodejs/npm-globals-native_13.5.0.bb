SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.5.0.tgz"
SRC_URI[md5sum] = "39dea189b93813c5729910cfd44c3e49"
SRC_URI[sha256sum] = "edca43095fb6772a865123d7ff04e1b4ff40fb6adf8700a2efc56d0f2240caf5"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
