SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.6.4.tgz"
SRC_URI[md5sum] = "7e8c56a3a4cd926c90775b1d90f72ab3"
SRC_URI[sha256sum] = "2bdd2fe12e1a6965796e36ac8b0070fec3af53558b26b21758aa8fcf829ded22"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
