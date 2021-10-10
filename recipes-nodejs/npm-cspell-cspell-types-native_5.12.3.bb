SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.12.3.tgz"
SRC_URI[md5sum] = "78cd88afebf341492a8dfcee0ec0feb0"
SRC_URI[sha256sum] = "f0b39cf9d3d531bc4e71740d90c3b72335e9cba99248a199b5ef94d692cf7ff0"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
