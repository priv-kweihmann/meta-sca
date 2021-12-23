SUMMARY = "NPM: globals"
DESCRIPTION = "Global identifiers from different JavaScript environments"
HOMEPAGE = "https://github.com/sindresorhus/globals#readme"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=d5f2a6dd0192dcc7c833e50bb9017337"

DEPENDS = "npm-type-fest-native"

SRC_URI = "https://registry.npmjs.org/globals/-/globals-13.12.0.tgz"
SRC_URI[md5sum] = "a244c5b22150d7fb9a89abb278efaaa7"
SRC_URI[sha256sum] = "4a57976b706533b1b329583fcc38fd1be1d39505575346720aa1344c5feb10f2"

NPM_PKGNAME = "globals"

inherit npmhelper
inherit native
