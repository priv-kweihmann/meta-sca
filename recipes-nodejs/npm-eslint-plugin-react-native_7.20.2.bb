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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.20.2.tgz"
SRC_URI[md5sum] = "949a8eea31ecb9aa38d8543cbf5f17ab"
SRC_URI[sha256sum] = "faa1c988ec19b1e8ed19b2bea2388bd406371c8a5ae94fd7942bcfc90e05dc69"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
