SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.16.0.tgz"
SRC_URI[md5sum] = "408711165b9408a381d303ac4844da90"
SRC_URI[sha256sum] = "fe401a24c58c795ab84093f5888456389dfd087d0d521447c185aaeff38226d1"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
