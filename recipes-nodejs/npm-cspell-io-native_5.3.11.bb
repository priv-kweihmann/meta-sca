SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.11.tgz"
SRC_URI[md5sum] = "d22a2f0f3b73e4829343ddb3f99228fb"
SRC_URI[sha256sum] = "347825f9a00ee1f5410b1a9b6849cd11b4e522d2cb563942930a0184ebf623e9"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
