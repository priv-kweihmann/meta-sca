SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.13.0.tgz"
SRC_URI[md5sum] = "324c37419a30ab6befc1c68b81c3ff8a"
SRC_URI[sha256sum] = "94e21705f14a79c1c4a3d462ff1815a1e24fd9744d32ae8c6a15bcf596ea9cc1"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
