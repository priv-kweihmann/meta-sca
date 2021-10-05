SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.12.0.tgz"
SRC_URI[md5sum] = "bb20ee04d0c6af148967a8f41ef50f62"
SRC_URI[sha256sum] = "c76da04679bfe66cc7a9227e8e506a999b8f59b10eada8f5e11e36c3f5f9ec21"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
