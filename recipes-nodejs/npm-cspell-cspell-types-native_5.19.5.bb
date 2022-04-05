SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.19.5.tgz"
SRC_URI[md5sum] = "703a2ab396f1538ff28cf6cf847650b9"
SRC_URI[sha256sum] = "d9c99b7edd7d0735f29ce5cacff7eff830b7bc4e199c1580f03ac4d626d7da3e"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
