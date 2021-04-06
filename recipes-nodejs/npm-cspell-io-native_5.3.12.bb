SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.12.tgz"
SRC_URI[md5sum] = "a4a390b4f913ac719242e1f43d32ce83"
SRC_URI[sha256sum] = "90b6ce91c606b8458d62f6d8c3b6709f0d47da3677284ef1e5a1b4e0647c215b"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
