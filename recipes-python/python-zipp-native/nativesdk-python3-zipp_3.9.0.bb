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

SRC_URI[md5sum] = "46815096f7e8cf91de9a0d6c84727608"
SRC_URI[sha256sum] = "3a7af91c3db40ec72dd9d154ae18e008c69efe8ca88dde4f9a731bb82fe2f9eb"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
