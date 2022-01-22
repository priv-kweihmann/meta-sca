SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "2c8a32f88af740643aea0d2ceb467fe8"
SRC_URI[sha256sum] = "97f32dc03a8054a4c4a5ab5d761ed4861e828b2c200febd4e46857069a483916"

inherit pypi
inherit setuptools3
inherit native
