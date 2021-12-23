SUMMARY = "NPM: textlint-tester"
DESCRIPTION = "testing tool for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/textlint-tester/"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-feature-flag-native \
           npm-textlint-kernel-native \
           npm-textlint-native"

SRC_URI = "https://registry.npmjs.org/textlint-tester/-/textlint-tester-12.1.0.tgz"
SRC_URI[md5sum] = "c1cf81d0b5fb0d28e5b40c0c75c73932"
SRC_URI[sha256sum] = "bc0f084bac69fd4ea4684100cbe782db51ecbe16e4d3b088664cd264c66f8488"

NPM_PKGNAME = "textlint-tester"

inherit npmhelper
inherit native
