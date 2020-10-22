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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.21.5.tgz"
SRC_URI[md5sum] = "fdbd3d5a69f27a8627a8d073f3ae1c20"
SRC_URI[sha256sum] = "583d5880600d6cffe70f0afc8051fec1f87c4677fb6c8d809e23efc02dfd1dc1"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
