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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.22.0.tgz"
SRC_URI[md5sum] = "f8892015c8ed97f14cc77a4b0b8a66d5"
SRC_URI[sha256sum] = "46a6f4263c10ec6a3a913bf01ebd65651e4741658a5996dae98bfc31fdd04a76"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
