SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.18.5.tgz"
SRC_URI[md5sum] = "6f8b920233343201f9e89de24bc9c156"
SRC_URI[sha256sum] = "c88345351dd704ef5469ee7670c08b8afaf3163d585cba4088889e0983aec14d"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
