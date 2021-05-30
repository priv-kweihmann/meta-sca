SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.4.tgz"
SRC_URI[md5sum] = "3cb070d506f6fb84ff7cce3481bdd446"
SRC_URI[sha256sum] = "fb29a650bc315f99f06beacc1ae20b65a02a0d53bd18bfcf274234ead0071423"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
