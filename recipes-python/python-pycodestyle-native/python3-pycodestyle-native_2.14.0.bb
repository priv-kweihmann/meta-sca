SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "d6dfb0c33b62be4c14ad9f447f6e0d61"
SRC_URI[sha256sum] = "c4b5b517d278089ff9d0abdec919cd97262a3367449ea1c8b49b91529167b783"

inherit pypi
inherit setuptools3
inherit_defer native
