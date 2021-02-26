SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.13.4.tgz"
SRC_URI[md5sum] = "8f4e79bfa147e203ce78f6a73f5b793b"
SRC_URI[sha256sum] = "9e76c4fafdc7ce536d69a6ab509c66c4f12d46ebebac1b86d98ffcb5281b9e5a"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
