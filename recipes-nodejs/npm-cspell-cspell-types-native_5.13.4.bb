SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.13.4.tgz"
SRC_URI[md5sum] = "7f8e3c9db9c490a39a62fa3579923bf8"
SRC_URI[sha256sum] = "c76f301d10043af3b37df6bf5d18d3f0ce5b26948b0cab36f0481aec363f9339"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
