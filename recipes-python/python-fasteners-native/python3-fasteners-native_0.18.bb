SUMMARY = "A python package that provides useful locks"
HOMEPAGE = "https://github.com/harlowja/fasteners"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4476c4be31402271e101d9a4a3430d52"

PYPI_PACKAGE = "fasteners"

SRC_URI[md5sum] = "d6f7b1c1399a3ac13345359944fdaeaf"
SRC_URI[sha256sum] = "cb7c13ef91e0c7e4fe4af38ecaf6b904ec3f5ce0dda06d34924b6b74b869d953"

inherit pypi
inherit python_setuptools_build_meta
inherit native
