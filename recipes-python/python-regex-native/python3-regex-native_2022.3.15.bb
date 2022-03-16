SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "74f1d120a146bc5a7811ccdbfee3d42d"
SRC_URI[sha256sum] = "0a7b75cc7bb4cc0334380053e4671c560e31272c9d2d5a6c4b8e9ae2c9bd0f82"

inherit pypi
inherit setuptools3
inherit native
