SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.19.5.tgz"
SRC_URI[md5sum] = "ab3c977e9ac428b7a54cf5087cbad6c4"
SRC_URI[sha256sum] = "cde86eaaffade708f3556ce9da718e7fc1b6893b3affd597bfdba5cfacf13c2f"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
