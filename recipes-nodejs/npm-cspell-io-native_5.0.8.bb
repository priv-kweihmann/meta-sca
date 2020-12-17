SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.0.8.tgz"
SRC_URI[md5sum] = "26ff6690c2fd1ff0aa75fec63ed1018c"
SRC_URI[sha256sum] = "32d39dcc682129dde344dfe8d1107440e834b4b82c2b2f81e6ce7b8ff08c3e25"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
