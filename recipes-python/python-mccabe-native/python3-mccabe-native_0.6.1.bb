SUMMARY = "McCabe complexity checker for Python"
HOMEPAGE = "https://github.com/pycqa/mccabe"

LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a489dc62bacbdad3335c0f160a974f0f"

DEPENDS += "python3-pytest-runner-native"

PYPI_PACKAGE = "mccabe"

SRC_URI[md5sum] = "723df2f7b1737b8887475bac4c763e1e"
SRC_URI[sha256sum] = "dd8d182285a0fe56bace7f45b5e7d1a6ebcbf524e8f3bd87eb0f125271b8831f"

inherit pypi
inherit setuptools3
inherit native
