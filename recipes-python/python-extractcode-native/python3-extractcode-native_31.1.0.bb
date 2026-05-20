SUMMARY = "universal archive extractor using z7zip, libarchve, other libraries"
HOMEPAGE = "https://github.com/nexB/extractcode"

DEPENDS += "\
    python3-commoncode-native \
    python3-extractcode-7z-system-provided-native \
    python3-extractcode-libarchive-system-provided-native \
    python3-patch-native \
    python3-plugincode-native \
    python3-typecode-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

PYPI_PACKAGE = "extractcode"

SRC_URI[md5sum] = "864777d0f3d5dcb1b62267e2e950f582"
SRC_URI[sha256sum] = "e62b75ecf0379beea79cd54d5f1341ac05ec39974e5695ad21d0abb86a0ab6a4"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

