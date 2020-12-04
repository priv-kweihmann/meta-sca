SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.0.3.tgz"
SRC_URI[md5sum] = "6e2f1ad3f9ad3d2a7651ab6cae2e759e"
SRC_URI[sha256sum] = "9a3b06dda6d962d00a4df1fc91783740898ab687eb128f37ad343604734d5286"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
