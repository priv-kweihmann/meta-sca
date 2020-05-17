SUMMARY = "NPM: @textlint/kernel"
DESCRIPTION = "textlint kernel is core logic by pure JavaScript."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-kernel/"

DEPENDS = "npm-debug-native npm-deep-equal-native npm-map-like-native npm-structured-source-native npm-textlint-ast-node-types-native npm-textlint-ast-tester-native npm-textlint-ast-traverse-native npm-textlint-feature-flag-native npm-textlint-types-native npm-textlint-utils-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-3.2.1.tgz"
SRC_URI[md5sum] = "b77ea5180aed1944ec4a4d0710773b99"
SRC_URI[sha256sum] = "0d444d2dac5a2386b5dd52b50047d1284718e43d3d460836d24f627a8f32a506"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
