SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.6.1.tgz"
SRC_URI[md5sum] = "d8c4eeee884a8c082772cb2f6e7d1311"
SRC_URI[sha256sum] = "3c032f01adbec3c4541456d33dab1be0286380dd8fed1ac51ad232af0708dbd4"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
