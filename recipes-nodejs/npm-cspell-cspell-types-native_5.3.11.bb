SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.11.tgz"
SRC_URI[md5sum] = "5582e1500e1b0bee9956ee670d42d2a2"
SRC_URI[sha256sum] = "acbe9c5537bc7bf18df652bcbc7a18f8a669a5377125c255625df98c3197f43b"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
