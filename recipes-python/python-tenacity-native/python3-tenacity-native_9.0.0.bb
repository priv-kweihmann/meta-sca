SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-six-native \
"

PYPI_PACKAGE = "tenacity"

SRC_URI[sha256sum] = "807f37ca97d62aa361264d497b0e31e92b8027044942bfa756160d908320d73b"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
