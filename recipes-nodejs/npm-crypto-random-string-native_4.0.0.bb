SUMMARY = "NPM: crypto-random-string"
DESCRIPTION = "Generate a cryptographically strong random string"
HOMEPAGE = "https://github.com/sindresorhus/crypto-random-string#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/crypto-random-string/-/crypto-random-string-4.0.0.tgz"
SRC_URI[md5sum] = "7803a3475ccc0320dbe6937570085cc4"
SRC_URI[sha256sum] = "00aa7b2fd21d408ca49d82c98e10d8ecde85459abb38c906559093a376b3fd76"

NPM_PKGNAME = "crypto-random-string"

inherit npmhelper
inherit native
