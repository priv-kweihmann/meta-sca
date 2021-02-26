SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.1.tgz"
SRC_URI[md5sum] = "1f4993895370226198cde8febddeb699"
SRC_URI[sha256sum] = "1ccb1b1ca8ca7a0f149bc3e78a082e28ca029a6c4aba963850bed8e8d4d931f9"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
