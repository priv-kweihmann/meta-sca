SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.7.tgz"
SRC_URI[md5sum] = "9083cded24998310d2d2219d6e1c6a52"
SRC_URI[sha256sum] = "7d26f50caef60cab6d22235690a6f2fad2fef208a7c01659457deeac973ba3c6"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
