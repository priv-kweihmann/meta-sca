SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-7.1.0.tgz"
SRC_URI[md5sum] = "5229b8f7acde3dcd99d61c15ba634da3"
SRC_URI[sha256sum] = "08d67329d0db916a5a1b1d1e9edd56c262fa5583fce2b77424c2bc78a8a380cb"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
