SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.0.4.tgz"
SRC_URI[md5sum] = "eb176220fb392be13e17a40f652137cd"
SRC_URI[sha256sum] = "fa3a83c0ab2625e90dea26129b41b1e124d32583ccd10ed68d3da81968e3bb2b"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
