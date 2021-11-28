SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.13.1.tgz"
SRC_URI[md5sum] = "fed25e1f9b731474c1e8543a3dcd5437"
SRC_URI[sha256sum] = "b7c7debe4bf5605afa754090fa40d09f350721a33fb3e876cf5ae64f7f4fc7ec"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
