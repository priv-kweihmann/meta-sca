SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.12.17.tgz"
SRC_URI[md5sum] = "93736792d9ebef6b93391568ce80ae49"
SRC_URI[sha256sum] = "783dc512065207a7097ba12c31e56e9d67486fb6eedddc75152261b3e568d836"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
