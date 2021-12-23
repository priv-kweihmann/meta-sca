SUMMARY = "Library with cross-python path, ini-parsing, io, code, log facilities"
HOMEPAGE = "http://py.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a6bb0320b04a0a503f12f69fea479de9"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "py"

SRC_URI[md5sum] = "bde7dcc1cb452a1e10206ef2f811ba88"
SRC_URI[sha256sum] = "51c75c4126074b472f746a24399ad32f6053d1b34b68d2fa41e558e6f4a98719"

inherit pypi
inherit setuptools3
inherit native
