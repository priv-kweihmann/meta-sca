SUMMARY = "NPM: unique-string"
DESCRIPTION = "Generate a unique random string"
HOMEPAGE = "https://github.com/sindresorhus/unique-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-crypto-random-string-native"

SRC_URI = "https://registry.npmjs.org/unique-string/-/unique-string-3.0.0.tgz"
SRC_URI[md5sum] = "fb5b0a11de7c4629b02c18e3a1cfab7a"
SRC_URI[sha256sum] = "4af072ac3ef82774d504eb3ad8af2b8f7f9d7577b02f0e6b51af4b6638b6eea1"

NPM_PKGNAME = "unique-string"

inherit npmhelper
inherit native
