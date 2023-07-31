SUMMARY = "A simple program which checks Python source files for errors"
HOMEPAGE = "https://github.com/PyCQA/pyflakes"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=690c2d09203dc9e07c4083fc45ea981f"

PYPI_PACKAGE = "pyflakes"

SRC_URI[md5sum] = "8018ec247e041c4a835dfb638fcf11f9"
SRC_URI[sha256sum] = "a0aae034c444db0071aa077972ba4768d40c830d9539fd45bf4cd3f8f6992efc"

inherit pypi
inherit setuptools3
inherit nativesdk
