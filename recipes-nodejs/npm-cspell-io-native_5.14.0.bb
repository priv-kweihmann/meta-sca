SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.14.0.tgz"
SRC_URI[md5sum] = "25a42eac200030509bd313225f74051b"
SRC_URI[sha256sum] = "03dc0c9c7be6576cfd9da7d39027cfd887e5380fd144dc9d9d5e74716bb591ab"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
