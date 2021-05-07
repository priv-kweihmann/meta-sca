SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.4.0.tgz"
SRC_URI[md5sum] = "93f5c0fdf765c2e6548a9ab601397b51"
SRC_URI[sha256sum] = "c482d5b0ae9742c0d558346c2502683fb7586f686cddc73e8db506d7f0d4b67c"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
