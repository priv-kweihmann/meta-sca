SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-5.1.0.tgz"
SRC_URI[md5sum] = "23b83a2792f90dfab48c4e4475cba4dd"
SRC_URI[sha256sum] = "f119b6efd4bbd4936bdf347a621c9f03e8f9998038e7698833d8a7aa9b2ac418"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
