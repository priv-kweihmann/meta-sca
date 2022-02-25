SUMMARY = "NPM: @textlint/kernel"
DESCRIPTION = "textlint kernel is core logic by pure JavaScript."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-kernel/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e13f89c6c99507a95c450fa5e043b0cb"

DEPENDS = "npm-debug-native \
           npm-deep-equal-native \
           npm-structured-source-native \
           npm-textlint-ast-node-types-native \
           npm-textlint-ast-tester-native \
           npm-textlint-ast-traverse-native \
           npm-textlint-feature-flag-native \
           npm-textlint-source-code-fixer-native \
           npm-textlint-types-native \
           npm-textlint-utils-native"

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-12.1.1.tgz"
SRC_URI[md5sum] = "d841903cc869f208ffa8d3ec7b841851"
SRC_URI[sha256sum] = "7ceea778cbec594686864c96ca69e8f8e755ded4b9c2b0c113429a3a69223217"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
