SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.10.0.tgz"
SRC_URI[md5sum] = "7366ec7bda560040ba3805ea46062f34"
SRC_URI[sha256sum] = "caf5c92cfd91592c35b14b3d672feadf2a852021f0ea0a791d041865665398d0"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
