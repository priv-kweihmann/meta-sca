SUMMARY = "NPM: @babel/helper-validator-identifier"
DESCRIPTION = "Validate identifier/keywords name"
HOMEPAGE = "{homepage}"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b1d0cd283a346e919abb3beeb018279d"

DEPENDS = ""

SRC_URI = "https://registry.npmjs.org/@babel/helper-validator-identifier/-/helper-validator-identifier-7.16.7.tgz"
SRC_URI[md5sum] = "01d9e7c98c18ad2aa95344c17478b185"
SRC_URI[sha256sum] = "f647395ab3d4535d85e87df8b3c9979e0bf91f8065145227fbf92c89b3070214"

NPM_PKGNAME = "@babel/helper-validator-identifier"

inherit npmhelper
inherit native
