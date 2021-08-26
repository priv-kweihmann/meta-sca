SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.8.2.tgz"
SRC_URI[md5sum] = "0b26308e5bc6c099da11abbbae302353"
SRC_URI[sha256sum] = "e05f70d7eb62d69448dcc9116be1b42006a8bc68829422c30c572cbf9e93dc59"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
