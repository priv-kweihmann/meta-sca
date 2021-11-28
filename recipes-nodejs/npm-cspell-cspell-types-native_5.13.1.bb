SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.13.1.tgz"
SRC_URI[md5sum] = "18037edda75c31b2bc6ccc0b051a21f7"
SRC_URI[sha256sum] = "e8850c1502e57e3afba07f538ff3c0ee675fbb31cf7f0f701f1aea4be7c0d9cd"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
