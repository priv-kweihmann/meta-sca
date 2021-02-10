SUMMARY = "Python docstring reStructuredText (RST) validator"
HOMEPAGE = "https://github.com/peterjc/flake8-rst-docstrings"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=3220ac937dae1dd25fe76c6c613288f5"

DEPENDS += "\
            python3-flake8-native \
            python3-restructuredtext-lint-native \
            "

PYPI_PACKAGE = "flake8-rst-docstrings"

SRC_URI[md5sum] = "991a10ef4f32fb58bd879936d108cb33"
SRC_URI[sha256sum] = "8f8bcb18f1408b506dd8ba2c99af3eac6128f6911d4bf6ff874b94caa70182a2"

inherit pypi
inherit setuptools3
inherit native
