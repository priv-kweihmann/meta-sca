SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.19.2.tgz"
SRC_URI[md5sum] = "be42386e349892fc7316980e7462771e"
SRC_URI[sha256sum] = "b288ec0991f35ba7eb811916daeac20faf53cc27f7b1b24e634ba5a1317236c6"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
