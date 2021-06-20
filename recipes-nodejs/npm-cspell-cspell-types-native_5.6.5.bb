SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.6.5.tgz"
SRC_URI[md5sum] = "c5dc0e4b028363f347c46b6aee030c78"
SRC_URI[sha256sum] = "c653a5d360aba4d2867cbb078383ad759e2c42d31cb20efe1f5ff2f215a5e7ef"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
