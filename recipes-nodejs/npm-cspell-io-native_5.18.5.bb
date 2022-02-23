SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.18.5.tgz"
SRC_URI[md5sum] = "3e58f7ff9679c5688c37da49b53d0108"
SRC_URI[sha256sum] = "2c5fa13d4a76830ebc9b835e2ecd2c8633292d472f26cae203d7fcd600faef27"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
