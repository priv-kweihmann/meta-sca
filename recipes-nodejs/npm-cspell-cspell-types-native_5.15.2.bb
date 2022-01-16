SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.15.2.tgz"
SRC_URI[md5sum] = "a946f25c22fa098cd334929e247763b8"
SRC_URI[sha256sum] = "24c00d18c242d3728d9140ca2e5f6bf51392a9743e391ecf0242dd8867abcdb4"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
