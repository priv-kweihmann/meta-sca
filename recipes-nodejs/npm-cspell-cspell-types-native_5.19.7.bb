SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.19.7.tgz"
SRC_URI[md5sum] = "37ba04d9ba42e635f8e445f9ae975327"
SRC_URI[sha256sum] = "28686edbc434a3b36133fde4c872f6917a6ee90d4a7e76db0ed9adf600a8f91d"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
