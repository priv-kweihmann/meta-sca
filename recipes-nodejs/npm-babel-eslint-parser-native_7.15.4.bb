SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.15.4.tgz"
SRC_URI[md5sum] = "a61ab2a3255f5125709d427ec5a3a8df"
SRC_URI[sha256sum] = "80c0147b5c67f1cefe055bbc238e974aa3c9b6f2c7b10d02cc040cc4c2ad2590"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
