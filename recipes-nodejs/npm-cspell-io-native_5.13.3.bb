SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.13.3.tgz"
SRC_URI[md5sum] = "85ec8e7ba18c3551a4d785e0d94e2dd8"
SRC_URI[sha256sum] = "bc1dbda853819e3287fa5a48c055cd3b3545023737b12ff0a458e70a95690615"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
