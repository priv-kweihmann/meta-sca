SUMMARY = "NPM: eslint-plugin-react"
DESCRIPTION = "React specific linting rules for ESLint"
HOMEPAGE = "https://github.com/yannickcr/eslint-plugin-react"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.29.3.tgz"
SRC_URI[md5sum] = "c168d2a95b5dccb3dfe19d482f38c340"
SRC_URI[sha256sum] = "ce8f4508ccac50a89bebfcfe66e08d597f3b17af15c42f99bfe636221f681619"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
