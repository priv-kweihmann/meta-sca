SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.11.1.tgz"
SRC_URI[md5sum] = "2da6104dfef27078af70f89cb3a98a34"
SRC_URI[sha256sum] = "926285cac619d5a360d97e8aa67ef18065686d044804ca0902f3db6dacc308c4"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
