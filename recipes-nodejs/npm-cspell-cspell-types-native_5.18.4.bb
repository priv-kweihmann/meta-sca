SUMMARY = "NPM: @cspell/cspell-types"
DESCRIPTION = "Types for cspell and cspell-lib"
HOMEPAGE = "https://github.com/streetsidesoftware/cspell#readme"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1befbdcbeb73a7fd9b944d31f0fee64"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@cspell/cspell-types/-/cspell-types-5.18.4.tgz"
SRC_URI[md5sum] = "324bed578d4a542c7509b008630d9139"
SRC_URI[sha256sum] = "674135bb9f0717ec2c9bad255c6d258e43b193d7bdf264cebd7bb5ce9f773674"

NPM_PKGNAME = "@cspell/cspell-types"

inherit npmhelper
inherit native
