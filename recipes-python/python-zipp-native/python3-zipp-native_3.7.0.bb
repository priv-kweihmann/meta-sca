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

SRC_URI[md5sum] = "5a1fc692b57b348d1e259484b405ddf6"
SRC_URI[sha256sum] = "9f50f446828eb9d45b267433fd3e9da8d801f614129124863f9c51ebceafb87d"

inherit pypi
inherit setuptools3
inherit native
