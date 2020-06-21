SUMMARY = "NPM: eslint-utils"
DESCRIPTION = "Utilities for ESLint plugins."
HOMEPAGE = "https://github.com/mysticatea/eslint-utils#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8f21789009221b0b37faaa24544da54"

DEPENDS = "npm-eslint-visitor-keys-native"

SRC_URI = "https://registry.npmjs.org/eslint-utils/-/eslint-utils-2.1.0.tgz"
SRC_URI[md5sum] = "c505c1bb78a32c604f21ebe42cff13ce"
SRC_URI[sha256sum] = "bb18ff87dfffc6bb2f519017a44b9d6a58122303561d399675c4daed2f488ff9"

NPM_PKGNAME = "eslint-utils"

inherit npmhelper
inherit native
