SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-12.0.2.tgz"
SRC_URI[md5sum] = "f122c42ed44aae804500b801f29b64ee"
SRC_URI[sha256sum] = "c4afd1d869bbe346a438c53422074f477c01f8a5fa13bfa6109e35d3f1781b31"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
