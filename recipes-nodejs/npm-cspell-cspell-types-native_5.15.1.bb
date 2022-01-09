SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.15.1.tgz"
SRC_URI[md5sum] = "eef1facef6e24d0b466d9d7312bb7159"
SRC_URI[sha256sum] = "8676048b052c5435e4e2b1c017751bd1f18cdd3e073f3e07150f897d414ae9ea"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
