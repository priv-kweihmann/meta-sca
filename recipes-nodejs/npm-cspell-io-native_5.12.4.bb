SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.12.4.tgz"
SRC_URI[md5sum] = "9fd605991c6a5488e7b48ce10e380b11"
SRC_URI[sha256sum] = "fd7b469dde56ad37a881893a7b97557855954840c0448e691e6a897b921d1070"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
