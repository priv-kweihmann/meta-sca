SUMMARY = "NPM: @babel/eslint-parser"
DESCRIPTION = "ESLint parser that allows for linting of experimental syntax transformed by Babel"
HOMEPAGE = "https://babel.dev/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = "npm-eslint-scope-native \
           npm-eslint-visitor-keys-native \
           npm-semver-native"

SRC_URI = "https://registry.npmjs.org/@babel/eslint-parser/-/eslint-parser-7.13.14.tgz"
SRC_URI[md5sum] = "65c0c4ca0b228d151e453c6959835999"
SRC_URI[sha256sum] = "a3dc703f28f795c638855d72a190a121ec3538d8f5ef367ced111f3f89b7c655"

NPM_PKGNAME = "@babel/eslint-parser"

inherit npmhelper
inherit native
