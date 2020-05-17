SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"

DEPENDS = "npm-array-includes-native npm-doctrine-native npm-eslint-plugin-eslint-plugin-native npm-has-native npm-jsx-ast-utils-native npm-object.entries-native npm-object.fromentries-native npm-object.values-native npm-prop-types-native npm-resolve-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.17.0.tgz"
SRC_URI[md5sum] = "e40141e349e7373dfe5b49d9bee19906"
SRC_URI[sha256sum] = "ce5c4cf2dbad822166ed5fdeb9a22e29c659fbd008ae567b542212a4520f5942"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
