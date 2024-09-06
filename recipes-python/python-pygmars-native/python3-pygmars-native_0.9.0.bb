SUMMARY = "simple regex-based small language lexers and parsers"
HOMEPAGE = "https://github.com/nexB/pygmars"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-setuptools-scm-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

PYPI_PACKAGE = "pygmars"

SRC_URI[md5sum] = "b7aa2954a06206498c1eb1c47b50f5ce"
SRC_URI[sha256sum] = "bc486cb3c4c7a22cc3d86077c51a741d1e2631c4cd409f33484974006063ee09"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
