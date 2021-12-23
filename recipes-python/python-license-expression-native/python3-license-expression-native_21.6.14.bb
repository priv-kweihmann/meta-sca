SUMMARY = "Utility library to parse, normalize and compare License expressions"
HOMEPAGE = "https://github.com/nexB/license-expression"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=9429839cdc4b292ff46e88b524c6e0c9"

DEPENDS += "\
    python3-booleanpy-native \
    python3-setuptools-scm-native \
    python3-toml-native \
"

PYPI_PACKAGE = "license-expression"

SRC_URI[md5sum] = "165b319ae722e49e8054e219ec234d90"
SRC_URI[sha256sum] = "9de87a427c9a449eee7913472fb9ed03b63036295547369fdbf95f76a8b924b2"

inherit pypi
inherit setuptools3
inherit native
