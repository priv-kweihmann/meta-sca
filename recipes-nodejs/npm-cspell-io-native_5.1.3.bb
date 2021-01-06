SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.1.3.tgz"
SRC_URI[md5sum] = "ceb15487770c8735d96313b5ebab63bf"
SRC_URI[sha256sum] = "69980696ca46d11d1daa08d8bedff962f37457f1ac9730a4ef07d65820d0f8b3"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
