SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.12.11.tgz"
SRC_URI[md5sum] = "7a8722e18203cfdb8c195ad276589390"
SRC_URI[sha256sum] = "be0aac74011d70fcf9b20951c875572c0ed8f4738d3f00999f15393e7628f40a"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
