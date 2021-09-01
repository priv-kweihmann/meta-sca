SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.9.0.tgz"
SRC_URI[md5sum] = "a9b1cb094580c25502b70b1eed6a1189"
SRC_URI[sha256sum] = "55e2b0025522a203b6171ab860347d31e9dee1ee61ccd0fd6647c49f1b8997b5"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
