SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.14.0.tgz"
SRC_URI[md5sum] = "be576337be6d70c434838dc1a5cc94fd"
SRC_URI[sha256sum] = "1668b8dcfff2c4661738e915461470edc239034a5bc8201efcd9542d8ef065d7"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
