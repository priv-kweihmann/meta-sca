SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.5.2.tgz"
SRC_URI[md5sum] = "7e161f33a53697233f1753a0d8cbbb63"
SRC_URI[sha256sum] = "8b4504e59c3df529af34eee37c6febc446bc46c89b4a4478493e8a7cdd01ea67"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
