SUMMARY = "NPM: cspell-lib"
DESCRIPTION = "A library of useful functions used across various cspell tools."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

DEPENDS = "npm-iconv-lite-native npm-rxjs-stream-native"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

SRC_URI = "https://registry.npmjs.org/cspell-lib/-/cspell-lib-3.0.8.tgz"
SRC_URI[md5sum] = "904cf5d5a88d0ce42f45d5cef7e6d071"
SRC_URI[sha256sum] = "bca5cd07ff2e0139cff08d7527d7e306e0934a87e585adf2b1b14cb85a043ba9"

S = "${WORKDIR}/package"

NPM_PKGNAME = "cspell-lib"

inherit npmhelper
inherit native
