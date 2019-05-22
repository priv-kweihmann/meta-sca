SUMMARY = "Pygments is a syntax highlighting package written in Python."
DESCRIPTION = "Pygments is a syntax highlighting package written in Python."
HOMEPAGE = "http://pygments.org/"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e1d7b7bffbfeaa14083fd2bd3236aea8"

DEPENDS += "\
            ${PYTHON_PN}-native \
            "

PYPI_PACKAGE = "Pygments"

inherit pypi

inherit native
