SUMMARY = "Helpful functions for Python"
HOMEPAGE = "https://github.com/domdfcoding/domdf_python_tools"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4e19299aa28f63ae1056d6b86a4d2023"

DEPENDS += "\
    python3-hatch-requirements-txt-native \
"

SRC_URI[sha256sum] = "518ac47b27a799a72b01377f21588e41550a59918c25a74fb55fc7d15fbb2434"

inherit pypi
inherit pypi-old
inherit python_hatchling
inherit_defer native

PYPI_PACKAGE = "domdf-python-tools"
