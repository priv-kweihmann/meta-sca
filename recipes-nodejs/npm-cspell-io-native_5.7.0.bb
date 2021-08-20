SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.7.0.tgz"
SRC_URI[md5sum] = "6d643eedae2ccd68c8a6efebd15f930e"
SRC_URI[sha256sum] = "1be68945e382acd97a8acdc309160f1f2aec8903db88f39b95f733ca2beacee3"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
