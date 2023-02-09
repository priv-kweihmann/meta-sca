SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "6cc740ee6b1c7e80262e914d1d5d7e79"
SRC_URI[sha256sum] = "a3cac813d40993596b39ea9e93a18e8a2076d5c378b8bc88ec32ab264e04ad02"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit native
