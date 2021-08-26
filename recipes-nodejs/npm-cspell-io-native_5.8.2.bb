SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.8.2.tgz"
SRC_URI[md5sum] = "b56540387d95e3570479292885daf198"
SRC_URI[sha256sum] = "df305345a56ed4c7c66b072ab39e847041a887110c0722485d9f7f402bac0ee8"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
