SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-12.1.0.tgz"
SRC_URI[md5sum] = "145953c6404c3ba3dde5a42e7897ab0a"
SRC_URI[sha256sum] = "01e13aad835190bf186866ca7aac4b274cec8ed83637a851d4446b7d298a8ac5"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
