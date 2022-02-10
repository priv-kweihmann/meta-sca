SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.18.4.tgz"
SRC_URI[md5sum] = "c4bea46885916f25c8623a2ae5012b24"
SRC_URI[sha256sum] = "ce976b2e082fea373a07063910de2df217d2d1eecb6bf61e6ac1092f89625698"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
