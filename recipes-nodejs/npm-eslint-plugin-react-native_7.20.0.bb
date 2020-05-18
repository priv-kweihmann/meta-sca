SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

DEPENDS = "npm-array-includes-native \
           npm-doctrine-native \
           npm-has-native \
           npm-jsx-ast-utils-native \
           npm-object.entries-native \
           npm-object.fromentries-native \
           npm-object.values-native \
           npm-prop-types-native \
           npm-resolve-native \
           npm-string.prototype.matchall-native \
           npm-xregexp-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.20.0.tgz"
SRC_URI[md5sum] = "d0ed837c911250cc2cdd37d840cfee25"
SRC_URI[sha256sum] = "e51079f749bc9e86738b9bb17d47666ed2318ad86ca68367a9547742c88b6aa0"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
