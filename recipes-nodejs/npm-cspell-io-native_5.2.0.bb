SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.2.0.tgz"
SRC_URI[md5sum] = "df0cdb91b4cf2342e17fe0ece86e0ea1"
SRC_URI[sha256sum] = "a2adefeeb64bd249a669bfeda4171e5757361caffb703ce49eac642b15d60e9b"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
