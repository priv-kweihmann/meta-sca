SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.18.3.tgz"
SRC_URI[md5sum] = "b072aff7c3d5dc329d3e3bdb91c9aa7e"
SRC_URI[sha256sum] = "b1c5c60e3f650483b8e388202ca4719dbe311ce8d4cb5cb9d55a0d1afca30170"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
