SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.18.4.tgz"
SRC_URI[md5sum] = "d6e334d1f5132e56b1af4156d8f2b9ac"
SRC_URI[sha256sum] = "f990f1466e81592baf4614eef35021cbe1cda123aaaa52b7fdf2434704aaf31d"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
