SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.10.0.tgz"
SRC_URI[md5sum] = "e464ad2814e4741fa91f05a76f15faca"
SRC_URI[sha256sum] = "4a9cca357744fe2bc38c68e6314464d7f3a851b6f20fdb7ec798857af0490877"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
