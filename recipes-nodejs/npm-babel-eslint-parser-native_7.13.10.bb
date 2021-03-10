SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.13.10.tgz"
SRC_URI[md5sum] = "66aa8eb45f1a21ec90f7f31f73cc97f4"
SRC_URI[sha256sum] = "7e793e6a11eb40bf932710681d6b6d33bff89dedba39e7da5a200c2181e17adb"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
