SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.15.7.tgz"
SRC_URI[md5sum] = "3fb5582549e92635ce3dbb2c4842f2f2"
SRC_URI[sha256sum] = "193ca35cd2411210990d9c53b6974083c88edeaae80e5d9c85132d38decdaf57"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
