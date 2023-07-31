SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "e8185700fa67ab415570e4fe941ebe2a"
SRC_URI[sha256sum] = "259bcc17857d8a8b3b4a2327324b79e5f020a13c16074670f9c8c8f872ea76d0"

inherit pypi
inherit setuptools3
inherit native
