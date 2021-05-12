SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.4.1.tgz"
SRC_URI[md5sum] = "a2f9de228bb20c2437207ff89238f5a3"
SRC_URI[sha256sum] = "e3a9a6c84339d8de67bfac74139b6d1aa686ff68400fd373fce5f992e99fe521"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
