SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.12.6.tgz"
SRC_URI[md5sum] = "0862201a46a77a6a0d4f7ce2cc69d5d8"
SRC_URI[sha256sum] = "6d97bc253ac80adc7f21bf3effb6e0959f64a656302f5795e318135cc5ce4bee"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
