SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "c7ed096441b4b4961c0756d4000d1ee7"
SRC_URI[sha256sum] = "41ba0e7afc9752dfb53ced5489e89f8186be00e599e712660695b7a75ff2663f"

inherit pypi
inherit setuptools3
inherit_defer native
