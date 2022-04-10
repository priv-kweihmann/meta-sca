SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.19.7.tgz"
SRC_URI[md5sum] = "79803451b352e82f6a718c74d522a348"
SRC_URI[sha256sum] = "e1b89ea85b03d479bd37e8a5ad825df3aec6c18db4f994d04d3819fa77541cd6"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
