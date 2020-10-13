SUMMARY = "NPM: normalize-url"
DESCRIPTION = "Normalize a URL"
HOMEPAGE = "https://github.com/sindresorhus/normalize-url#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://license;md5=915042b5df33c31a6db2b37eadaa00e3"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/normalize-url/-/normalize-url-5.3.0.tgz"
SRC_URI[md5sum] = "c54951a175a6ad967eee6f82c6b617f2"
SRC_URI[sha256sum] = "0943c33f55c253d3b9409c9b5a0046a8a8aa6a007cc06524e4c5a0e37563fcd1"

NPM_PKGNAME = "normalize-url"

inherit npmhelper
inherit native
