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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.20.5.tgz"
SRC_URI[md5sum] = "b56e70ac6ca058eaf689095e404b0c57"
SRC_URI[sha256sum] = "693ef7aa447c00c303ccd0ed331567222f299476d0dcbff765db2f8c4e7346f7"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
