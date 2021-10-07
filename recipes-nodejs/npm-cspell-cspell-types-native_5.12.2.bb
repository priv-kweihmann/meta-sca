SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.12.2.tgz"
SRC_URI[md5sum] = "10feb473dbc2c95acd10c8a17123e59f"
SRC_URI[sha256sum] = "58ebcd58765ac731b0048e034cbb3ea197fcbe6ac198d432c3929b526d5f0164"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
