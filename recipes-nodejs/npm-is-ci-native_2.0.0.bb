SUMMARY = "NPM: is-ci"
DESCRIPTION = "Detect if the current environment is a CI server"
HOMEPAGE = "https://github.com/watson/is-ci"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0c6fa9c682ce05a9a4da4f4a96cf42ec"

DEPENDS = "npm-ci-info-native"

SRC_URI = "https://registry.npmjs.org/is-ci/-/is-ci-2.0.0.tgz"
SRC_URI[md5sum] = "24ff5fd68de825a624dafa333b9722c5"
SRC_URI[sha256sum] = "1196489cdb590ea0296b88802e2539cfab2ec5b6a5da0457186305b33a214b9e"

NPM_PKGNAME = "is-ci"

inherit npmhelper
inherit native
