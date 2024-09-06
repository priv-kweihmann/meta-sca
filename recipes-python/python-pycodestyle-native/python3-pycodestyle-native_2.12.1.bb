SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "a116089dc7267cfd082c779680b8cab2"
SRC_URI[sha256sum] = "6838eae08bbce4f6accd5d5572075c63626a15ee3e6f842df996bf62f6d73521"

inherit pypi
inherit setuptools3
inherit_defer native
