SUMMARY = "Core utilities for Python packages"
HOMEPAGE = "https://github.com/pypa/packaging"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.BSD;md5=7bef9bf4a8e4263634d0597e7ba100b8"

PYPI_PACKAGE = "packaging"

DEPENDS += "${PYTHON_PN}-six-native"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "a02ce566f10c701b4c42e39a4ce59c93"
SRC_URI[sha256sum] = "e665345f9eef0c621aa0bf2f8d78cf6d21904eef16a93f020240b704a57f1334"
