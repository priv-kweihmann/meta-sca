SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.4.0.tgz"
SRC_URI[md5sum] = "81d3981ff874a9f514019c8830a5b44e"
SRC_URI[sha256sum] = "3f9399cae2ea3dcac6b5c78086f366014f3b6d223c8fefec13aee541fcf3f0ae"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
