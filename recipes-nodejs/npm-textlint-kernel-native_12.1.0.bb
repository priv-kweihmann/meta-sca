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

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-12.1.0.tgz"
SRC_URI[md5sum] = "ab10b3958811732a1c6e639a7c1c40b0"
SRC_URI[sha256sum] = "835d8941d6f98bbe33ec05568929932ae486546acd83641af7ce2eb3c38a8cab"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
