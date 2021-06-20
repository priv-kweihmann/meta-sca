SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.6.5.tgz"
SRC_URI[md5sum] = "37ff5ca359848d2eb607164e877c31e6"
SRC_URI[sha256sum] = "8bb356d07d40da1f559ebb7444685032bf321f43ac046f02fc9cf4e5543d98d2"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
