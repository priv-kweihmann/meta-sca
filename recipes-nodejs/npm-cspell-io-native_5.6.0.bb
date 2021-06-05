SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.6.0.tgz"
SRC_URI[md5sum] = "70c015799880ea03a196e8e42b3572ec"
SRC_URI[sha256sum] = "d458f4ec05f7690cc1f025f74bbd11f1d13f27d4e415811c5c5206ec61fb3428"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
