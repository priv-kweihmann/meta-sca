SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.14.0.tgz"
SRC_URI[md5sum] = "bec720696f005609f37c9c7ca1c67f3f"
SRC_URI[sha256sum] = "c8bc31fb5c0b23411056c321231cabd383db0f2d40eff60a48635fd08723dc69"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
