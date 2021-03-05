SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.3.5.tgz"
SRC_URI[md5sum] = "66f9fc8e3c932160efd7ac961e19a707"
SRC_URI[sha256sum] = "6b79ba234486603cc09de3971c8fdf308b8f0bf837ab1605534f6f5920bc0029"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
