SUMMARY = "NPM: eslint-scope"
DESCRIPTION = "ECMAScript scope analyzer for ESLint"
HOMEPAGE = "http://github.com/eslint/eslint-scope"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ea6adf57b10b6fe7db502260e0beab6a"

DEPENDS = "npm-esrecurse-native \
           npm-estraverse-native"

SRC_URI = "https://registry.npmjs.org/eslint-scope/-/eslint-scope-5.1.1.tgz"
SRC_URI[md5sum] = "f408bd3b3f362281a58fc2223f530cf1"
SRC_URI[sha256sum] = "b5d26255cc994fa39aa49a70a1f068ce0272743b4b8adda8d7f6399f15f43118"

NPM_PKGNAME = "eslint-scope"

inherit npmhelper
inherit native
