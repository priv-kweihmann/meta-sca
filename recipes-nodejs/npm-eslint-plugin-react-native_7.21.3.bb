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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.21.3.tgz"
SRC_URI[md5sum] = "e24f1c16ea1f3a13d27eabe162a7403e"
SRC_URI[sha256sum] = "704dd4d43124c0b4ffab1bf03f4cb93c8f20cccb93e8e0a0c94e71187054c8ef"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
