SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.9.1.tgz"
SRC_URI[md5sum] = "11b6079e7722fdc349858a9f739771b7"
SRC_URI[sha256sum] = "51a1554f5ae1c0eb33560dd216fbff0e3862ee8ce359b4f72e213272e272572e"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
