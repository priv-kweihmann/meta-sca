SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.13.4.tgz"
SRC_URI[md5sum] = "97b7a965cbdc7e23a9c3585f9be0448a"
SRC_URI[sha256sum] = "88c5e444bca888381d5d6907d73fee20a37be06ff77b8908e708215b85fb54fe"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
