SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.13.8.tgz"
SRC_URI[md5sum] = "1d1e7dbc55c4aaacff7cef0bea46d4d6"
SRC_URI[sha256sum] = "73ec950b584c1b217d48c9d891ed8b53ac0e5c57f7f7f705c86888ec2cd135a1"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
