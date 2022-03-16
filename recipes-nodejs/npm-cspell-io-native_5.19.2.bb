SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.19.2.tgz"
SRC_URI[md5sum] = "703e0ff1c7071da2f50ef953001a83a3"
SRC_URI[sha256sum] = "d754c0195e064c6e4e86a6a67b6701ac328158119aaebf7dc562b1d73915e218"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
