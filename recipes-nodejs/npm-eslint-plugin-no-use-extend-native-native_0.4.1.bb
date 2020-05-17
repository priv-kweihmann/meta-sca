SUMMARY = "NPM: eslint-plugin-no-use-extend-native"
DESCRIPTION = "ESLint plugin to prevent use of extended native objects"
HOMEPAGE = "https://github.com/dustinspecker/eslint-plugin-no-use-extend-native#readme"

DEPENDS = "npm-is-get-set-prop-native npm-is-js-type-native npm-is-obj-prop-native npm-is-proto-prop-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license.md;md5=512b547cdbdb32ef8bcbd275eb09a8bd"

SRC_URI = "https://registry.npmjs.org/eslint-plugin-no-use-extend-native/-/eslint-plugin-no-use-extend-native-0.4.1.tgz"
SRC_URI[md5sum] = "05acb065d013989a6e6dcc4e6be6b0e3"
SRC_URI[sha256sum] = "fc9d2278b57976efcd583c28d87f12d997ca25effac47a74c7f6364c837a1a5a"

NPM_PKGNAME = "eslint-plugin-no-use-extend-native"

inherit npmhelper
inherit native
