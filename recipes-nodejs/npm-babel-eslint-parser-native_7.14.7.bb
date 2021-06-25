SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.7.tgz"
SRC_URI[md5sum] = "0e0bbf16dd7c6f856894bd21f9273b3c"
SRC_URI[sha256sum] = "eab878f126574da7cd6829f630f0a821ad6bf193e40b46cc1c82522b38e68b84"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
