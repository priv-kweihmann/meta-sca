SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.13.2.tgz"
SRC_URI[md5sum] = "de4ea739827fa9ed70aa53971bf8e571"
SRC_URI[sha256sum] = "70da65a575b3fa30d7f8435761a5780f3ae42248261e6381ea3f102bb294f198"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
