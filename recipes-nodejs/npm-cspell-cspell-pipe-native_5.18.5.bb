SUMMARY = "NPM: @cspell/cspell-pipe"
DESCRIPTION = "Library to make working with Iterators/AsyncIterators easier."
HOMEPAGE = "https://github.com/streetsidesoftware/cspell/tree/main/packages/cspell-pipe#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-pipe/-/cspell-pipe-5.18.5.tgz"
SRC_URI[md5sum] = "144d893235d8d19e71360dd5ff374468"
SRC_URI[sha256sum] = "cf3a7c9dc6f0a9ae83e357cac17ffdf3bbacc95eff0c5a123681b67ce940bf59"

NPM_PKGNAME = "@cspell/cspell-pipe"

inherit npmhelper
inherit native
