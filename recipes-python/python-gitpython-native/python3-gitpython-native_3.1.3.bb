SUMMARY = "GitPython is a python library used to interact with Git repositories"
HOMEPAGE = "https://github.com/gitpython-developers/GitPython"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8b8d26c37c1d5a04f9b0186edbebc183"

DEPENDS += "\
            ${PYTHON_PN}-ddt-native \
            ${PYTHON_PN}-gitdb-native \
           "

PYPI_PACKAGE = "GitPython"

SRC_URI[md5sum] = "d434385cef71d71b7cf69af52f5e4cb3"
SRC_URI[sha256sum] = "e107af4d873daed64648b4f4beb89f89f0cfbe3ef558fc7821ed2331c2f8da1a"

inherit pypi
inherit setuptools3
inherit native
