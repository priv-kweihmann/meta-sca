SUMMARY = "Sorted Containers -- Sorted List, Sorted Dict, Sorted Set"
HOMEPAGE = "https://github.com/grantjenks/python-sortedcontainers"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7c7c6a1a12ec816da16c1839137d53ae"

PYPI_PACKAGE = "sortedcontainers"

SRC_URI[md5sum] = "50eeb6cb739568b590b28f9a3f445c78"
SRC_URI[sha256sum] = "25caa5a06cc30b6b83d11423433f65d1f9d76c4c6a0c90e3379eaa43b9bfdb88"

inherit pypi
inherit setuptools3
inherit native
