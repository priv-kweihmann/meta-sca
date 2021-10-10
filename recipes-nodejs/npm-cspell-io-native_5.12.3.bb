SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.12.3.tgz"
SRC_URI[md5sum] = "2e2ce37084ec0564f7fbcc700a4163ab"
SRC_URI[sha256sum] = "abe876808ffc2a8c5cee454aad6c5b4393e53a8ca5850451bf8cf3748accf595"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
