SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.14.2.tgz"
SRC_URI[md5sum] = "34f6012738e4d87365e0866882705f1c"
SRC_URI[sha256sum] = "980d08756f3044006f5464732165ed1942fbb2b3975e31c675af6976226a4db0"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
