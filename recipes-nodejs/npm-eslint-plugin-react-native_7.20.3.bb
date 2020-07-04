SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flatmap-native \
           npm-doctrine-native \
           npm-has-native \
           npm-jsx-ast-utils-native \
           npm-object.entries-native \
           npm-object.fromentries-native \
           npm-object.values-native \
           npm-prop-types-native \
           npm-resolve-native \
           npm-string.prototype.matchall-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.20.3.tgz"
SRC_URI[md5sum] = "46fedab901d2ffc96f245d1b9a544cd1"
SRC_URI[sha256sum] = "3c9592dc331a927f167cf8b15e83a9ec56495ff8eb2cbec22c9dd4abe93985f2"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
