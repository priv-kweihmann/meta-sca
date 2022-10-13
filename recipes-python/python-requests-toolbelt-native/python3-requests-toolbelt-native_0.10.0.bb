SUMMARY = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://github.com/requests/toolbelt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6f14302a4b4099009ab38b4dde5f1075"

DEPENDS += "\
            python3-requests-native \
           "

PYPI_PACKAGE = "requests-toolbelt"

SRC_URI[md5sum] = "4276725871c828da59f618c1e6149d92"
SRC_URI[sha256sum] = "f695d6207931200b46c8ef6addbc8a921fb5d77cc4cd209c2e7d39293fcd2b30"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-requests"
