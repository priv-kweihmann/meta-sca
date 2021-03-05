SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.3.5.tgz"
SRC_URI[md5sum] = "f2cb88eb338a47dd8640629d7c6c1ef4"
SRC_URI[sha256sum] = "fd22ef89930b64268f8d0b4d8ade5a785a0f6d004b9352745ed4e92761361e32"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
