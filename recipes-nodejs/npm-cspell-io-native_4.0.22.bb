SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.0.22.tgz"
SRC_URI[md5sum] = "16cd145fd7895e7041c794aa3b9e88af"
SRC_URI[sha256sum] = "cde8959e5566c96bafc151e5cee597a946aaf967db5b95df7ed17db01d436c82"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
