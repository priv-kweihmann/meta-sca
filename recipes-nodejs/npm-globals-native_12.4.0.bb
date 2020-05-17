SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

DEPENDS = "npm-type-fest-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-12.4.0.tgz"
SRC_URI[md5sum] = "0d25b5727be5e00e90ba69304a0f1cc3"
SRC_URI[sha256sum] = "d4e5c5ad808e7d589781b9be4092f862f943656471ba604214aae6f68fb0ce48"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
