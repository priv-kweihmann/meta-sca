SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.19.5.tgz"
SRC_URI[md5sum] = "869950a276fe8d358eda9cbe8d3ab059"
SRC_URI[sha256sum] = "c82f819db0e1e35f657dbb07d321946cc402315a5e39a299ec906ca13bf40c3d"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
