SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "https://github.com/babel/babel#readme"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.10.4.tgz"
SRC_URI[md5sum] = "24a6a7f1db051f41336b180a4409500f"
SRC_URI[sha256sum] = "4d3b1623d4abc23b2f0fa1bec979b1312dc256b4fe42a4492f9b8f669e019156"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
