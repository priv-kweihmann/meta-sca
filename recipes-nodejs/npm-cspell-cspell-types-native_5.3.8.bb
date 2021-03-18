SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.8.tgz"
SRC_URI[md5sum] = "22b8794a2ad9b39e0b10c67d430e5e85"
SRC_URI[sha256sum] = "8056cfd1ea7f84806c047fb813c58d075ad94670120cf7062a8c11722380844d"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
