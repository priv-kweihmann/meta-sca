SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "python3-hatch-vcs-native"

PYPI_PACKAGE = "tenacity"

SRC_URI[sha256sum] = "a606b5c808d0cded4a359d5b9932d867ff2a6a6b64d37350260fd01bbdf83839"

inherit pypi
inherit python_hatchling
inherit_defer native
