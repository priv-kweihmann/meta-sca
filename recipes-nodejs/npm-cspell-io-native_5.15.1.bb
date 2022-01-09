SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.15.1.tgz"
SRC_URI[md5sum] = "ac844bce8a94bc36cacd9127d369ebde"
SRC_URI[sha256sum] = "937574acc66766558ee56d713cda9d9885720fcd68c6118026ed1b0f6bcdb9d2"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
