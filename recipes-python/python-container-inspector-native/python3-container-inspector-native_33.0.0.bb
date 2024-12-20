SUMMARY = "suite of analysis utilities and command line tools for Docker images"
HOMEPAGE = "https://github.com/nexB/container-inspector"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-attrs-native \
    python3-click-native \
    python3-commoncode-native \
    python3-dockerfile-parse-native \
"

PYPI_PACKAGE = "container-inspector"

SRC_URI[sha256sum] = "09260edb14549648da61260c1559b507e9dcb8296a6324368ba3803ca2011f7c"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native
