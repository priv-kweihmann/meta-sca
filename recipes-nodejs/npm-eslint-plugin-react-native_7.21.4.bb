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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.21.4.tgz"
SRC_URI[md5sum] = "b2c43d8bb3f12821ef2fe8129f09cd8f"
SRC_URI[sha256sum] = "6e71347918bb0208ef30acc02e2898c5ce82660d7433b1f2524c6405a8198b41"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
