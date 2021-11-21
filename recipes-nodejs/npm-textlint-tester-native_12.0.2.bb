SUMMARY = "NPM: textlint-tester"
DESCRIPTION = "testing tool for textlint rule."
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/textlint-tester/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b858910af2bca39133b1536464b54f49"

DEPENDS = "npm-textlint-feature-flag-native \
           npm-textlint-kernel-native \
           npm-textlint-native"

SRC_URI = "https://registry.npmjs.org/textlint-tester/-/textlint-tester-12.0.2.tgz"
SRC_URI[md5sum] = "37fab18f3fd1d1b93cb231632b1e2879"
SRC_URI[sha256sum] = "ae07746467374f1196b9710df5d7fe87be445bca6702a45ab59670588058609d"

NPM_PKGNAME = "textlint-tester"

inherit npmhelper
inherit native
