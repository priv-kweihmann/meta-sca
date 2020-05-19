SUMMARY = "NPM: eslint-plugin-no-use-extend-native"
DESCRIPTION = "ESLint plugin to prevent use of extended native objects"
HOMEPAGE = "https://github.com/dustinspecker/eslint-plugin-no-use-extend-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

DEPENDS = "npm-is-get-set-prop-native \
           npm-is-js-type-native \
           npm-is-obj-prop-native \
           npm-is-proto-prop-native"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-use-extend-native/-/eslint-plugin-no-use-extend-native-0.5.0.tgz"
SRC_URI[md5sum] = "a48d077c9bea5967828bfa4ccb30879d"
SRC_URI[sha256sum] = "6f9c93d0bbddd682af54ef449e7f7bb8bf9212521c7a0051a03ca204c2f2ea96"

NPM_PKGNAME = "eslint-plugin-no-use-extend-native"

inherit npmhelper
inherit native
