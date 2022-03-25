SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.19.3.tgz"
SRC_URI[md5sum] = "d7f543b59d8fcc90c1d458c1366a7458"
SRC_URI[sha256sum] = "140326e96be147399979a08c4f06cf1cf21558bbb9834a8faeda527c78c9794e"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
