SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.5.tgz"
SRC_URI[md5sum] = "8e03e8a2d6c9ae779fd82202b40053d8"
SRC_URI[sha256sum] = "f02515e9fa64d2771264f4a9c7847b5f669a57500364b2947a1cdf8d648e7835"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
