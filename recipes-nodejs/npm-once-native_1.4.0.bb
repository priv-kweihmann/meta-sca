SUMMARY = "NPM: once"
DESCRIPTION = "Run a function exactly one time"
HOMEPAGE = "https://github.com/isaacs/once#readme"

DEPENDS = "npm-wrappy-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=82703a69f6d7411dde679954c2fd9dca"

SRC_URI = "https://registry.npmjs.org/once/-/once-1.4.0.tgz"
SRC_URI[md5sum] = "fac2afc3cbe5e133d7a5c34ec3f862ac"
SRC_URI[sha256sum] = "cf51460ba370c698f68b976e514d113497339ba018b6003e8e8eb569c6fccfcf"

S = "${WORKDIR}/package"

NPM_PKGNAME = "once"

inherit npmhelper
inherit native
