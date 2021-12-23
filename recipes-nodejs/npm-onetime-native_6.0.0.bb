SUMMARY = "NPM: onetime"
DESCRIPTION = "Ensure a function is only called once"
HOMEPAGE = "https://github.com/sindresorhus/onetime#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-mimic-fn-native"

SRC_URI = "https://registry.npmjs.org/onetime/-/onetime-6.0.0.tgz"
SRC_URI[md5sum] = "f6f4aca5b9cb8b83ff3d2ef5e8bc31f2"
SRC_URI[sha256sum] = "a92ec7988e8de7726ca9bfa91ded437bc48d5d07f231c0285b9a6733dde7434e"

NPM_PKGNAME = "onetime"

inherit npmhelper
inherit native
