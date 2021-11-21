SUMMARY = "NPM: @textlint/kernel"
DESCRIPTION = "textlint kernel is core logic by pure JavaScript."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/textlint-kernel/"

DEFAULT_PREFERENCE = "-1"
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

SRC_URI = "https://registry.npmjs.org/@textlint/kernel/-/kernel-12.0.2.tgz"
SRC_URI[md5sum] = "6518d29534a27239ccbf84f54c290420"
SRC_URI[sha256sum] = "50420c090f2bf2864a428b32dbcccc23db87d573a9fc81fdfe27ea5d92e05131"

NPM_PKGNAME = "@textlint/kernel"

inherit npmhelper
inherit native
