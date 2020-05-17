SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

DEPENDS = "npm-esrecurse-native npm-estraverse-native"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-5.0.0.tgz"
SRC_URI[md5sum] = "229ef2035391fe0a6d175472d6478b2e"
SRC_URI[sha256sum] = "9fa568e6606410872105668d6dfffe5113e1ace3bce4d51c346648e399d522d1"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
