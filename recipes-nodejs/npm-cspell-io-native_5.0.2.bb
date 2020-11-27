SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.0.2.tgz"
SRC_URI[md5sum] = "9536fc2db2c7013771f5f1ea3393fdfb"
SRC_URI[sha256sum] = "9b0515190c3a4113de2dd59ae8b38875735b7a330f2439c4b805077134ed139a"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
