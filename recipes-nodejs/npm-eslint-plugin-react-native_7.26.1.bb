SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1dbc7fedfc1975d32106f930116d0082"

DEPENDS = "npm-array-includes-native \
           npm-array.prototype.flatmap-native \
           npm-doctrine-native \
           npm-estraverse-native \
           npm-jsx-ast-utils-native \
           npm-minimatch-native \
           npm-object.entries-native \
           npm-object.fromentries-native \
           npm-object.hasown-native \
           npm-object.values-native \
           npm-prop-types-native \
           npm-resolve-native \
           npm-semver-native \
           npm-string.prototype.matchall-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.26.1.tgz"
SRC_URI[md5sum] = "288eb0633523108e74f648461cc040b3"
SRC_URI[sha256sum] = "90e3b9c81d947f5d84beabcc011402f43f5ea53f7c72f71c09430eaf82eb099f"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
