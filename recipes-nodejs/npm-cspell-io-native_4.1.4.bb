SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.1.4.tgz"
SRC_URI[md5sum] = "f03afc3998253cd8f69deed18fb9de04"
SRC_URI[sha256sum] = "7a9a7eb15428e165691ddfff34e58f9bec85d08e690c3a374fd2d89ce3a4cc92"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
