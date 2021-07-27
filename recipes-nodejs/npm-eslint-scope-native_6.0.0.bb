SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-6.0.0.tgz"
SRC_URI[md5sum] = "f67b6e2125267724a48e9048d2f1d421"
SRC_URI[sha256sum] = "c5dd35082f824a9a853fb6e2efe0ce9dce056d5cefc4b7e949ad8a8662a72ffb"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
