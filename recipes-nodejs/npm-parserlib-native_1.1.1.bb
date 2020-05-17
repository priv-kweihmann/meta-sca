SUMMARY = "NPM: parserlib"
DESCRIPTION = "CSS3 SAX-inspired parser"
HOMEPAGE = "https://github.com/CSSLint/parser-lib"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d5250253d5fdb99d69858874b1b5a8d"

SRC_URI = "https://registry.npmjs.org/parserlib/-/parserlib-1.1.1.tgz"
SRC_URI[md5sum] = "74229a93e709ffb3d1533e7e0046cc5b"
SRC_URI[sha256sum] = "1067ed248276d7a2eabcac156b4fa2ba0f75edb58ee3b18355372efd9e318879"

S = "${WORKDIR}/package"

NPM_PKGNAME = "parserlib"

inherit npmhelper
inherit native
