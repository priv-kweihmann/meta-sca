SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.12.4.tgz"
SRC_URI[md5sum] = "1a160d157046fac5bb9ae77fef64f0db"
SRC_URI[sha256sum] = "3e6eda327f83fbaec7a1027ee6f1ccac9a790d35d7d180958a0ad86e6311b6fc"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
