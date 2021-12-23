SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.15.7.tgz"
SRC_URI[md5sum] = "1fa7906a88d02ff83c45a9a0ac493a2c"
SRC_URI[sha256sum] = "e82c52b3212752a83b25d23923e298bddf89073128cac997aa4e97f03eef56fd"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
