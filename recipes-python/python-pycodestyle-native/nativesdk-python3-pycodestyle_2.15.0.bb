SUMMARY = "Simple Python style checker in one Python file"
HOMEPAGE = "https://github.com/PyCQA/pycodestyle"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LicenseRef-EXPAT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=a8546d0e77f416fb05a26acd89c8b3bd"

PYPI_PACKAGE = "pycodestyle"

SRC_URI[md5sum] = "bb0e6fa579768aeedab6e7dc9e3d8a97"
SRC_URI[sha256sum] = "318f5db083869b4c4dad922d0b11124fb27ab181b6730b93371da671e31bd50e"

inherit pypi
inherit setuptools3
inherit_defer nativesdk
