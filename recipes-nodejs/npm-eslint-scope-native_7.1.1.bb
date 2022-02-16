SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-7.1.1.tgz"
SRC_URI[md5sum] = "30d797bc24b459115c73ed27248a8acc"
SRC_URI[sha256sum] = "a6bce6b059e3471f99d86e15de9f86e47636540d440085c83d7e7e88b096074a"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
