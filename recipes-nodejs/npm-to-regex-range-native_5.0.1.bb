SUMMARY = "NPM: to-regex-range"
DESCRIPTION = "Pass two numbers, get a regex-compatible source string for matching ranges. Validated against more than 2.78 million test assertions."
HOMEPAGE = "https://github.com/micromatch/to-regex-range"

DEPENDS = "npm-is-number-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b561e0a423bedc9d9ca9c8c67d40abb9"

SRC_URI = "https://registry.npmjs.org/to-regex-range/-/to-regex-range-5.0.1.tgz"
SRC_URI[md5sum] = "5ef0a1bd28f353c14bf940103a879257"
SRC_URI[sha256sum] = "a63a255ec20a935c3a3334a6645f9245db36e2319ddf1eb6bc0eab2bfe5b42d7"

NPM_PKGNAME = "to-regex-range"

inherit npmhelper
inherit native
