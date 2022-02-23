SUMMARY = "NPM: textlint-rule-common-misspellings"
DESCRIPTION = "textlint rule to check common misspellings"
HOMEPAGE = "https://github.com/io-monad/textlint-rule-common-misspellings"

DEPENDS = "npm-misspellings-native npm-textlint-rule-helper-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d32239bcb673463ab874e80d47fae504"

SRC_URI = "https://registry.npmjs.org/textlint-rule-common-misspellings/-/textlint-rule-common-misspellings-1.0.1.tgz"
SRC_URI[md5sum] = "721377e5c4ea0502710064c3542e20ef"
SRC_URI[sha256sum] = "e5055be53db21aeba73614501b96eb250ca271145b3bc5dec338ced91ccdd1b2"

NPM_PKGNAME = "textlint-rule-common-misspellings"

inherit npmhelper
inherit native
