SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-7.0.0.tgz"
SRC_URI[md5sum] = "4c8de2f8756042d5d04aa0f2ef447be8"
SRC_URI[sha256sum] = "ea82b22ee8976bd79358f54708f83fbafdb111aa17a63b00365ed65bf3435c16"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
