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

SRC_URI[md5sum] = "8864ff5ed01cd28755cc87f1443dbc67"
SRC_URI[sha256sum] = "56bf8aadb83c24db6c4b577e13de374ccfb67da2078beba1d037c17980bf43ad"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit native
