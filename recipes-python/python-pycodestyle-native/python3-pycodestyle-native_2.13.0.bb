SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "4e0e9d54c06f24a457a552e8e038f9d2"
SRC_URI[sha256sum] = "c8415bf09abe81d9c7f872502a6eee881fbe85d8763dd5b9924bb0a01d67efae"

inherit pypi
inherit setuptools3
inherit_defer native
