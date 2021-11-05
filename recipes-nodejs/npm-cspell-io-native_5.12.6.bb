SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.12.6.tgz"
SRC_URI[md5sum] = "10027f80ff7808b0fed3e62bef2314af"
SRC_URI[sha256sum] = "7ea2ffcb08104af5f3bdfe026c0588350c3d3d17a0d37043b28e74da9ae9d20a"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
