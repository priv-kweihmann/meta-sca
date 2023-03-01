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

SRC_URI[md5sum] = "6e06bc2894588451a9787b9f22f9b0ba"
SRC_URI[sha256sum] = "112929ad649da941c23de50f356a2b5570c954b65150642bccdd66bf194d224b"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
