SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.11.1.tgz"
SRC_URI[md5sum] = "15335779e2aeb59615df005a5e1aeff4"
SRC_URI[sha256sum] = "55858090c496307a582f1ffc3d00c558364890dbd16cfd4719fc61d97692f643"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
