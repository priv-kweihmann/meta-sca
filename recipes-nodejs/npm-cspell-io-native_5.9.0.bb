SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.9.0.tgz"
SRC_URI[md5sum] = "2a97a7628080eba6eac9447a8d7a85ef"
SRC_URI[sha256sum] = "a0323f7170cfae31d2f9afb8dbf560521ca52b1f93a28b477dfe055686033450"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
