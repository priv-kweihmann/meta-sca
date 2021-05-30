SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.5.2.tgz"
SRC_URI[md5sum] = "b8fb745c2ca9554495eb214a75112a9c"
SRC_URI[sha256sum] = "4ebc28bee64028460d670ff9f468a4e6cc2c2626b2805c4a0cba2d6e64bd6a7f"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
