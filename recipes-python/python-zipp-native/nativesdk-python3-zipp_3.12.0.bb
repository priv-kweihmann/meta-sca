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

SRC_URI[md5sum] = "1f0f67e3e7856aef6e91ba353ce524e3"
SRC_URI[sha256sum] = "73efd63936398aac78fd92b6f4865190119d6c91b531532e798977ea8dd402eb"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
