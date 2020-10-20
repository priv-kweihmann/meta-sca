SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-4.1.1.tgz"
SRC_URI[md5sum] = "53049ece7e6bf716ff3427595b53654a"
SRC_URI[sha256sum] = "eb4373daa5a47ed763272057861e3f6e0f63f0b31aeb580deecff73a33430891"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
