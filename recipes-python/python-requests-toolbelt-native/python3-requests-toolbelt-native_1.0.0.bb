SUMMARY = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://github.com/requests/toolbelt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f14302a4b4099009ab38b4dde5f1075"

DEPENDS += "\
            python3-requests-native \
           "

PYPI_PACKAGE = "requests-toolbelt"

SRC_URI[md5sum] = "6a8348cfc9991b44e499345db1c6f925"
SRC_URI[sha256sum] = "7681a0a3d047012b5bdc0ee37d7f8f07ebe76ab08caeccfc3921ce23c88d5bc6"

inherit pypi
inherit setuptools3
inherit_defer native
