SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.12.tgz"
SRC_URI[md5sum] = "f93888b0e87b83d7f0642dfa82b3ac0c"
SRC_URI[sha256sum] = "9b65f3c23d1c1df7715a371d7ba30cbc74d8a3efabab319fe7dc2f66d0ceb33c"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
