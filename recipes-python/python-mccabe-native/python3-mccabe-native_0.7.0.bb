SUMMARY = "McCabe complexity checker for Python"
HOMEPAGE = "https://github.com/pycqa/mccabe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a489dc62bacbdad3335c0f160a974f0f"

DEPENDS += "python3-pytest-runner-native"

PYPI_PACKAGE = "mccabe"

SRC_URI[md5sum] = "374ee2b9407546bb41d195e7436e5f62"
SRC_URI[sha256sum] = "348e0240c33b60bbdf4e523192ef919f28cb2c3d7d5c7794f74009290f236325"

inherit pypi
inherit setuptools3
inherit_defer native
