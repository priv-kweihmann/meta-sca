SUMMARY = "Type Hints for Python"
HOMEPAGE = "https://github.com/python/typing"

LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=64fc2b30b67d0a8423c250e0386ed72f"

PYPI_PACKAGE = "typing"

SRC_URI[md5sum] = "276296e7b6b617d4f8b5e8874f240bd4"
SRC_URI[sha256sum] = "1187fb9c82fd670d10aa07bbb6cfcfe4bdda42d6fab8d5134f04e8c4d0b71cc9"

inherit pypi
inherit setuptools3
inherit native
