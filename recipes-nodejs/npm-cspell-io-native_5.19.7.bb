SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.19.7.tgz"
SRC_URI[md5sum] = "03fc1f24fec515d6af95dc00f8283753"
SRC_URI[sha256sum] = "4db39bd14ba2b777e7f18a6d1cc2c30c44b9ac827ad126712ba3d3e05c3d47da"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
