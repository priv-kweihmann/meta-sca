SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.13.3.tgz"
SRC_URI[md5sum] = "a3d2c0c7fe347b2a517e3c2c8893e04e"
SRC_URI[sha256sum] = "3bb37e3b709007610475247a7e3406a45cc0ce25a5f3444d7b2a1c0d2f68afdb"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
