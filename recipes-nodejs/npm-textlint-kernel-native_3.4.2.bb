SUMMARY = "NPM: @textlint/kernel"
DESCRIPTION = "textlint kernel is core logic by pure JavaScript."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-kernel/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-debug-native \
           npm-deep-equal-native \
           npm-map-like-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-textlint-ast-tester-native \
           npm-textlint-ast-traverse-native \
           npm-textlint-feature-flag-native \
           npm-textlint-source-code-fixer-native \
           npm-textlint-types-native \
           npm-textlint-utils-native"

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-3.4.2.tgz"
SRC_URI[md5sum] = "8e7f7feb74f512fd3d5b13c3f174fdf6"
SRC_URI[sha256sum] = "7a4f4209d23c5f797fa3f09cc1dd4019bb1801b84408ef138348813d72c5b952"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
