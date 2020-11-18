SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.1.6.tgz"
SRC_URI[md5sum] = "b83b3a0f7e009ca32f23b302b0be90a4"
SRC_URI[sha256sum] = "df696f199fac2a7d30891e102b6dc4a7128fdbed8bb4ffe47dc8310fe4be7acb"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
