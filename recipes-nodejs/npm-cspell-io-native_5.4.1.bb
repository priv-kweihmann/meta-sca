SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.4.1.tgz"
SRC_URI[md5sum] = "dc7aecc93c0327b26db9e433e2cb0069"
SRC_URI[sha256sum] = "c2b87a477f7226b4f48f28733f2b3ea71ef008723798c68f6edc29163021b043"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
