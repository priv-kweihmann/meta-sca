SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.6.0.tgz"
SRC_URI[md5sum] = "4259e2577439ba4aa8707435ecce5c77"
SRC_URI[sha256sum] = "3c46da3f6e3925e3992d4863dc1061f4e1fd8315a369434a6d3d02c76a8c79a2"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
