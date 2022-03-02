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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.29.2.tgz"
SRC_URI[md5sum] = "1ea2e65980a265b9c9a37b72d005e388"
SRC_URI[sha256sum] = "afca3b4af0574863c5a0be640a81e108596b0d095e313e35da363f8dc43227ff"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
