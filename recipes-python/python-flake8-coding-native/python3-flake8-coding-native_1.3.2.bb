SUMMARY = "Adds coding magic comment checks (coding:) to flake8"
HOMEPAGE = "https://github.com/tk0miya/flake8-coding"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-coding"

SRC_URI[md5sum] = "252eb677f0e0e30e8d9a7ce5ae92aa02"
SRC_URI[sha256sum] = "b8f4d5157a8f74670e6cfea732c3d9f4291a4e994c8701d2c55f787c6e6cb741"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
