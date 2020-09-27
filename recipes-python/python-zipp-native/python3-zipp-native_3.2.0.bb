SUMMARY = "Backport of pathlib-compatible object wrapper for zip files"
HOMEPAGE = "https://github.com/jaraco/zipp"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
            ${PYTHON_PN}-setuptools-scm-native \
            ${PYTHON_PN}-toml-native \
            "

PYPI_PACKAGE = "zipp"

SRC_URI[md5sum] = "321a0dfa1080d58e5de0800a26565452"
SRC_URI[sha256sum] = "b52f22895f4cfce194bc8172f3819ee8de7540aa6d873535a8668b730b8b411f"

inherit pypi
inherit native
inherit setuptools3
