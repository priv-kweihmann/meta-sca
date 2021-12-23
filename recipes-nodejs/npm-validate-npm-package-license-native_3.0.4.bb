SUMMARY = "NPM: validate-npm-package-license"
DESCRIPTION = "Give me a string and I'll tell you if it's a valid npm package license string"
HOMEPAGE = "https://github.com/kemitchell/validate-npm-package-license.js#readme"

DEPENDS = "npm-spdx-correct-native npm-spdx-expression-parse-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

SRC_URI = "https://registry.npmjs.org/validate-npm-package-license/-/validate-npm-package-license-3.0.4.tgz"
SRC_URI[md5sum] = "c84f22a6bf1922d9d2a65c9779b3eea8"
SRC_URI[sha256sum] = "0166efb34d41a131d4df2a75f8ff84314be35c0dacf6fec265602de66777fd8c"

NPM_PKGNAME = "validate-npm-package-license"

inherit npmhelper
inherit native
