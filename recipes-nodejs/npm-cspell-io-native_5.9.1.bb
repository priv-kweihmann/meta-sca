SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.9.1.tgz"
SRC_URI[md5sum] = "916cb7eec747f3f490294662af47b56a"
SRC_URI[sha256sum] = "63543557fa311064678154929512eaf38a78360c7c902c3b5848f8150459b481"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
