SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.13.2.tgz"
SRC_URI[md5sum] = "461f67159c7ab5b02ce4f4a5fd285e1e"
SRC_URI[sha256sum] = "79cfdb50a88bc45c8ba0785f7cb0cac3e50bf3539da3b42a5213cce0f21f0740"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
