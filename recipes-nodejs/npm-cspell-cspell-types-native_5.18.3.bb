SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.18.3.tgz"
SRC_URI[md5sum] = "c4eafaf73d5180219d196f9310079842"
SRC_URI[sha256sum] = "b45fa399f9770bd015feca7491bb308be01baf0fecab0ce33bb9c323e42b633f"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
