SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.9.tgz"
SRC_URI[md5sum] = "e0f9c9433054bd68c6bf7fac81487e82"
SRC_URI[sha256sum] = "a29651f6f1af9aa033df7c45c9e65d5d4ae6710d11f1b62559a6c07c22e58a51"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
