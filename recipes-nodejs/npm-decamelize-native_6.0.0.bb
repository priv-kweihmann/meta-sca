SUMMARY = "NPM: decamelize"
DESCRIPTION = "Convert a camelized string into a lowercased one with a custom separator: unicornRainbow → unicorn_rainbow"
HOMEPAGE = "https://github.com/sindresorhus/decamelize#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/decamelize/-/decamelize-6.0.0.tgz"
SRC_URI[md5sum] = "5ebb258236a7ac0326727c9c8ed83442"
SRC_URI[sha256sum] = "ef264448fe275577f422b5af1ac8084d5589600760f79f0f1dc5487a006ed3c3"

NPM_PKGNAME = "decamelize"

inherit npmhelper
inherit native
