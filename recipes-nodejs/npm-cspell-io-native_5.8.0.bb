SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.8.0.tgz"
SRC_URI[md5sum] = "0a86743c1b8b918ff352f8d61d645d34"
SRC_URI[sha256sum] = "d0ec2a677f70a8594970ae70ff608adc895d5ab019cb7cbfe8e8a14dc74eefa6"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
