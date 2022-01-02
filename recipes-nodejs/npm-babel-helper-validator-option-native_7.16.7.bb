SUMMARY = "NPM: @babel/helper-validator-option"
DESCRIPTION = "Validate plugin/preset options"
HOMEPAGE = "{homepage}"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-option/-/helper-validator-option-7.16.7.tgz"
SRC_URI[md5sum] = "b3ec7314cda7a9c17735693d598b560d"
SRC_URI[sha256sum] = "a0ff716706e338847d605bca3044ce2b53e37dc428175681c960900f8f2d389a"

NPM_PKGNAME = "@babel/helper-validator-option"

inherit npmhelper
inherit native
