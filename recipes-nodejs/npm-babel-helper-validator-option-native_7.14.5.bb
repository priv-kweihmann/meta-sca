SUMMARY = "NPM: @babel/helper-validator-option"
DESCRIPTION = "Validate plugin/preset options"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-option/-/helper-validator-option-7.14.5.tgz"
SRC_URI[md5sum] = "3c74acfd4acec325951c072441a6941d"
SRC_URI[sha256sum] = "941f2f1fa7927f0f64f10c173b7dcfd9a807fe7b0f194e546c35066899e24edf"

NPM_PKGNAME = "@babel/helper-validator-option"

inherit npmhelper
inherit native
