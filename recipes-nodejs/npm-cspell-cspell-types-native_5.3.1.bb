SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.1.tgz"
SRC_URI[md5sum] = "dd1d4715f39fb68fb95085fa82be1528"
SRC_URI[sha256sum] = "5bdb4a10ab54139916e8387641cfbd338147e4031aaeafc2b6633caf86f163d6"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
