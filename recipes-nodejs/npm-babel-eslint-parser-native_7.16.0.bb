SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.16.0.tgz"
SRC_URI[md5sum] = "ab85a7e78939bc4c437a961b6d9e3f28"
SRC_URI[sha256sum] = "e3ba8c069d097f587962bbc3f975d8d60e8e1b7e4bf5fae1c92cf6180957ea3f"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
