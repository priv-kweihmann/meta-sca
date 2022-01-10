SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17b7180fcfc43c4e70c07c71588604c4"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-tomli-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI[md5sum] = "9659998bca8c44b41055650394924619"
SRC_URI[sha256sum] = "0038b21890867793581e4cb0d810829f5fd4441aa75796b53033af3aa30430ce"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "mypy"
