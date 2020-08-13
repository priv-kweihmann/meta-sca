SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.1.0.tgz"
SRC_URI[md5sum] = "a7ac112947a51aa4ed0990fa0eb5a386"
SRC_URI[sha256sum] = "8845ea8327223863bddb9b9c2df96d57ff20a9ac9390ae0203d99a5a206d6c06"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
