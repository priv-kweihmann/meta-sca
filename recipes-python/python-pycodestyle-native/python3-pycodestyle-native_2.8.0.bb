SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "7f4f7cc6634e9388a8bbd35f92e66a6b"
SRC_URI[sha256sum] = "eddd5847ef438ea1c7870ca7eb78a9d47ce0cdb4851a5523949f2601d0cbbe7f"

inherit pypi
inherit setuptools3
inherit native
