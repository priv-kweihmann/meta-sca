SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.7.tgz"
SRC_URI[md5sum] = "51b6668e6fd2c38a0dd10aae02d88e66"
SRC_URI[sha256sum] = "59bc05be32020b654541abfab7ec0b8c2ad999e4462d7bbf12b867057f5f8896"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
