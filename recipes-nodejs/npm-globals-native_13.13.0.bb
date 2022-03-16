SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.13.0.tgz"
SRC_URI[md5sum] = "5bc8e1528cbb5f9d9696db4a9eca38ac"
SRC_URI[sha256sum] = "c8f0cc576aa2fdf14910352fe1f8b4c61064516db5c53184ae2cef6f06d1de22"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
