SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            ${PYTHON_PN}-setuptools-scm-native \
            ${PYTHON_PN}-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "dbf8b5f261ec28a180ac19ab4056d2c9"
SRC_URI[sha256sum] = "adf8f2ed8f614ced567d849cae9d183cef6cfd27c77a5cae7a28029be0c2b7a7"

inherit pypi
inherit native
inherit setuptools3
