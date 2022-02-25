SUMMARY = "NPM: textlint-tester"
DESCRIPTION = "testing tool for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/textlint-tester/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-feature-flag-native \
           npm-textlint-kernel-native \
           npm-textlint-native"

SRC_URI = "https://registry.npmjs.org/textlint-tester/-/textlint-tester-12.1.1.tgz"
SRC_URI[md5sum] = "b88429ee6692cc493c70129a8ecf02b3"
SRC_URI[sha256sum] = "7723021777aff69b96518414caa3667ff802ebbbffb3cee5389157230195c376"

NPM_PKGNAME = "textlint-tester"

inherit npmhelper
inherit native
