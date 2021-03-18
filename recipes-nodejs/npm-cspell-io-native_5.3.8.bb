SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.8.tgz"
SRC_URI[md5sum] = "509bc65272c27b0d21cb250c1308b195"
SRC_URI[sha256sum] = "66935c8d3cae261b7e5ede5ec4cc43c9b25313a698c8d43c46b4c7f5c827656c"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
