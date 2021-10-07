SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.15.8.tgz"
SRC_URI[md5sum] = "f036d2e0cf20d176852ff1bb6cff8157"
SRC_URI[sha256sum] = "dbec477c87ac0d8b64b295b9f234d216ae38ea7b7cc6c18e060946bfdba7a15c"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
