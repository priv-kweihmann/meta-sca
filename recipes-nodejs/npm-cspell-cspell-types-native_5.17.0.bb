SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.17.0.tgz"
SRC_URI[md5sum] = "1a0a8d3b451f3ebd0cd707e26a6dea5f"
SRC_URI[sha256sum] = "99986ef1b9ab87119f37b3614767971f288f1f7a852889657a2ed219a84433d5"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
