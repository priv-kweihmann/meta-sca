SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.12.2.tgz"
SRC_URI[md5sum] = "e3a4f618566a432349603256873b67d6"
SRC_URI[sha256sum] = "b1bab299c504f87888f1463f2e784290a76fb526d6a91dc1ab69c312cdba6fd6"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
