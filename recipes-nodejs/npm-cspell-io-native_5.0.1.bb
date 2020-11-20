SUMMARY = "NPM: cspell-io"
DESCRIPTION = "A library of useful I/O functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = "npm-iconv-lite-native \
           npm-iterable-to-stream-native"

SRC_URI = "https://registry.npmjs.org/cspell-io/-/cspell-io-5.0.1.tgz"
SRC_URI[md5sum] = "b74a84164bc54cfed745e82a61c7bed1"
SRC_URI[sha256sum] = "d30d223d2e8434d422145d5e9e1a49a62137b61cfc36c941526145c3aaa76da0"

NPM_PKGNAME = "cspell-io"

inherit npmhelper
inherit native
