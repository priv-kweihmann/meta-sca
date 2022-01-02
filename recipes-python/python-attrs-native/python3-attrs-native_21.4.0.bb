SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://github.com/python-attrs/attrs"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

PYPI_PACKAGE = "attrs"

SRC_URI[md5sum] = "5a9b5e9ceebc380a13fb93235b11bbda"
SRC_URI[sha256sum] = "626ba8234211db98e869df76230a137c4c40a12d72445c45d5f5b716f076e2fd"

inherit pypi
inherit setuptools3
inherit native
