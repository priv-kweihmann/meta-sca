SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.12.1.tgz"
SRC_URI[md5sum] = "b6801b6d83664287ce7aa3ec39a0708b"
SRC_URI[sha256sum] = "c6ba8a1e38eaf8df9e986e8cfd983af5240f10c2f01515c6e704e798e133e539"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
