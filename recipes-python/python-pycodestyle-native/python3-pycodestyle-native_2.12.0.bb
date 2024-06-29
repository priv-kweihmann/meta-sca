SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "3859b1db6962b7fa6327e48f1d0db771"
SRC_URI[sha256sum] = "442f950141b4f43df752dd303511ffded3a04c2b6fb7f65980574f0c31e6e79c"

inherit pypi
inherit setuptools3
inherit_defer native
