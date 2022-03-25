SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.19.3.tgz"
SRC_URI[md5sum] = "00acd067c1a82b92d0c6163bab71db6a"
SRC_URI[sha256sum] = "1a6b58ab237e6196139cd56f221ebdc91d116b85d09afd4c145d44d591ef4332"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
