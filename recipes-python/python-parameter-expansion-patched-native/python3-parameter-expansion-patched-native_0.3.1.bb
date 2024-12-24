SUMMARY = "POSIX parameter expansion in Python"
HOMEPAGE = "https://github.com/aboutcode-org/parameter_expansion_patched"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "parameter-expansion-patched"
PYPI_ESCAPE_PACKAGE_NAME = "0"

SRC_URI[md5sum] = "42fd64babe52ba313bb26948fba48cd2"
SRC_URI[sha256sum] = "ff5dbc89fbde582f3336562d196b710771e92baa7b6d59356a14b085a0b6740b"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
