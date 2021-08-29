SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flatmap-native \
           npm-doctrine-native \
           npm-estraverse-native \
           npm-has-native \
           npm-jsx-ast-utils-native \
           npm-minimatch-native \
           npm-object.entries-native \
           npm-object.fromentries-native \
           npm-object.values-native \
           npm-prop-types-native \
           npm-resolve-native \
           npm-string.prototype.matchall-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.25.0.tgz"
SRC_URI[md5sum] = "80d32dc9893553b0b9fd8eaf6e338da3"
SRC_URI[sha256sum] = "b84e733f07923878a962d8838e9131b9526c1028237b190d09ff2c438bf3bf81"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
