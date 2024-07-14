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

SRC_URI[sha256sum] = "8bc6c0c8a09b31e6cad13c47afbed1a567518250a9a171418582ed8d9c20ca78"

inherit pypi
inherit setuptools3
inherit_defer native
