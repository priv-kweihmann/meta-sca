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

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-3.4.4.tgz"
SRC_URI[md5sum] = "5e2f4f92bc8e4f726bad6a9dc889fc79"
SRC_URI[sha256sum] = "fc54fd66459a1552c83facad9b4c01ebaae934504d0b540618949f7f00d48f00"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
