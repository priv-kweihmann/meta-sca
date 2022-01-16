SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.15.2.tgz"
SRC_URI[md5sum] = "5a4eb47f028ea18489aad0a0d0ec1d67"
SRC_URI[sha256sum] = "1741156ea9897e2e3fce0ffff056205666bcd782bb6bb21adbf5ee4e34823969"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
