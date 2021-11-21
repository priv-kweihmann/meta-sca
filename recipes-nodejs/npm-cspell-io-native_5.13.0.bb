SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.13.0.tgz"
SRC_URI[md5sum] = "b398facb4d1a45bf0e3c1d31baac1242"
SRC_URI[sha256sum] = "695137dc050912497a704646b79c79df187d8c4af830991b224ae88e966ecb49"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
