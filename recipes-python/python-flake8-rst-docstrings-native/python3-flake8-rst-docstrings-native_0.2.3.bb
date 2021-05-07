SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=647e2c41944e325227c84555a6bced85"

DEPENDS += "\
            python3-flake8-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "e018666e40af21248c6c558b29287b5d"
SRC_URI[sha256sum] = "3045794e1c8467fba33aaea5c246b8369efc9c44ef8b0b20199bb6df7a4bd47b"

inherit pypi
inherit setuptools3
inherit native
