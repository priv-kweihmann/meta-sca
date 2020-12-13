SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

DEPENDS += "${PYTHON_PN}-six-native"

PYPI_PACKAGE = "packaging"

SRC_URI[md5sum] = "101110b3d512d544b70fd61d58482eaf"
SRC_URI[sha256sum] = "78598185a7008a470d64526a8059de9aaa449238f280fc9eb6b13ba6c4109093"

inherit pypi
inherit native
inherit setuptools3
