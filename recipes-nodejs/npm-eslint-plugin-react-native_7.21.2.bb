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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.21.2.tgz"
SRC_URI[md5sum] = "e7c258fe9d930e6631fe4e039460f7c5"
SRC_URI[sha256sum] = "be69e41916e04fe2bf7831d9f861205fc99df580ff66f83017f3138dbb7d0fd3"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
