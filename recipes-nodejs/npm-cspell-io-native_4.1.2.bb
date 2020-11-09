SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.1.2.tgz"
SRC_URI[md5sum] = "9db73d4f2e5f95b2e224f7e9b3172ec7"
SRC_URI[sha256sum] = "fa047edda429be1faa873a183f79fed394f1816673bc8d100d2923def43e2b5d"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
