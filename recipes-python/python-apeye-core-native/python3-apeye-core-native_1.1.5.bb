SUMMARY = "Core (offline) functionality for the apeye library."
HOMEPAGE = "https://github.com/domdfcoding/apeye-core"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=051ae3e827cc68ccf2c8767264e143c9"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

DEPENDS += "\
    python3-domdf-python-tools-native \
    python3-hatch-requirements-txt-native \
    python3-idna-native \
"

SRC_URI[sha256sum] = "5de72ed3d00cc9b20fea55e54b7ab8f5ef8500eb33a5368bc162a5585e238a55"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer native

PYPI_PACKAGE = "apeye-core"
