SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.3.tgz"
SRC_URI[md5sum] = "214f9d0991bb4cf3568d07340de5c5a4"
SRC_URI[sha256sum] = "198d3f0e8c4ed3afa17b9500f9fbae1e6f88bd7e22c49db5870e3a1280df2891"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
