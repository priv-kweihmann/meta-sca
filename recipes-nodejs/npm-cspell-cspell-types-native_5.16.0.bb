SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.16.0.tgz"
SRC_URI[md5sum] = "cfcfcafa5caabceabf96375cf91b7c7f"
SRC_URI[sha256sum] = "c6763e2b802075b97f848e75b4d779af90eb96a126067cafb92b82ede2950912"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
