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

SRC_URI[md5sum] = "f75b65d022528a44877626641f0f95c3"
SRC_URI[sha256sum] = "7a7262fd930bd3e36c50b9a64897aec3fafff3dfdeec9623ae22b40e93f99bb8"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
