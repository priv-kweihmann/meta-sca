SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.17.0.tgz"
SRC_URI[md5sum] = "e6d5f19682ceffa49f44d7cdcfde169a"
SRC_URI[sha256sum] = "4404e8cd76ea00603ca3f05ccf0df12a62f39556b2f5e4faf8ef208f57d5faa1"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
