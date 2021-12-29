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

SRC_URI = "https://registry.npmjs.org/eslint-plugin-react/-/eslint-plugin-react-7.28.0.tgz"
SRC_URI[md5sum] = "601ac9e7582deff700f6738dc1464e7f"
SRC_URI[sha256sum] = "0182e119fa4287b25eaa50db42fe65217aa6d4844f38612431e1fc142d647def"

NPM_PKGNAME = "eslint-plugin-react"

inherit npmhelper
inherit native
