SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.3.1.tgz"
SRC_URI[md5sum] = "b3a9ad21e551b5245c7d49c08ead9f90"
SRC_URI[sha256sum] = "419f6f4e87c9013dab75866cfa157e0497c4d071afd9785ad5d01b0538fc54c4"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
