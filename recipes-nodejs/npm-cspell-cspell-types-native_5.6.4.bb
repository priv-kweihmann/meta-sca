SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.6.4.tgz"
SRC_URI[md5sum] = "6287e342feb9f5f98744700d0f8bb8c7"
SRC_URI[sha256sum] = "c62f604d6e31aa2c649a165c6aaca2ae0b902c0943311dc82877f0ea6c12b3b6"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
