SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.16.3.tgz"
SRC_URI[md5sum] = "83c501f8f0521ef8391cf8204ca781dc"
SRC_URI[sha256sum] = "adcfa77797fd2a96598ae8f2f320ef88e36ea719e8b540fab56809551d3130c2"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
