SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.18.3.tgz"
SRC_URI[md5sum] = "a4dba8068d35e2eb19c3ef6b92882640"
SRC_URI[sha256sum] = "70bc46ae9a2cd80130fd27ab54750e8b74799fd4300f6007acb2c6fd40ab33f0"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
