SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.1.0.tgz"
SRC_URI[md5sum] = "dbd79dbda40b1838b0de82b5865fe21e"
SRC_URI[sha256sum] = "60e3f9834a2d674dcfc2c9427a7efe7eb9b01b329305fe726ffc5917a560a486"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
