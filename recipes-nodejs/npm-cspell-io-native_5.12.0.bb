SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.12.0.tgz"
SRC_URI[md5sum] = "3bee7451fbfebbd4ad563db4317b4f02"
SRC_URI[sha256sum] = "13b878af8d7cd8b8817fcd78d1a8f1883d699ecdb79663c9dc895267498695cd"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
