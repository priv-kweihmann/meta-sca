SUMMARY = "NPM: @textlint/ast-traverse"
DESCRIPTION = "TxtNode traverse library"
HOMEPAGE = "https://github.com/textlint/textlint/tree/master/packages/@textlint/ast-traverse"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ac49fb893a5f9f03c162f1927dfc7bc1"

DEPENDS = "npm-textlint-ast-node-types-native"

SRC_URI = "https://registry.npmjs.org/@textlint/ast-traverse/-/ast-traverse-2.2.5.tgz"
SRC_URI[md5sum] = "bfb3ef267e3bcf95778c265036e359fb"
SRC_URI[sha256sum] = "1478a126e615d46523df6f8068f0db5de03508fe602734b6efa9d8b85991f988"

NPM_PKGNAME = "@textlint/ast-traverse"

inherit npmhelper
inherit native
