SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.19.2.tgz"
SRC_URI[md5sum] = "e1dd55a5c6764c6e7e57aa40eacea5eb"
SRC_URI[sha256sum] = "519d4cc4a092111b41aca688fd3d42d1fc1956316c538ffd8140fcb25f7713e2"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
