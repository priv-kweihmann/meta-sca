SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.19.3.tgz"
SRC_URI[md5sum] = "86c8b16349353dbb95459c236a03717c"
SRC_URI[sha256sum] = "3ed33564c329163729263ace529a8db95b850168b6af1dc98a73f6c0a77a7e4a"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
