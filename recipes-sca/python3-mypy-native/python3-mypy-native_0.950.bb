SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6ba8ec528da02073b7e1f4124c0f836f"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-tomli-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI[md5sum] = "e85323a1281643f3489ecf768012deaa"
SRC_URI[sha256sum] = "1b333cfbca1762ff15808a0ef4f71b5d3eed8528b23ea1c3fb50543c867d68de"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "mypy"
