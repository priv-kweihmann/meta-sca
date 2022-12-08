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

SRC_URI[md5sum] = "1fbff3bca7294a3a7f09fa3f0652c3da"
SRC_URI[sha256sum] = "a7a22e05929290a67401440b39690ae6563279bced5f314609d9d03798f56766"

inherit pypi
inherit setuptools3
inherit python_setuptools_build_meta
inherit nativesdk
