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

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

SRC_URI_append = " file://0001-Remove-strict-versioning-of-plugins.patch"

PYPI_PACKAGE = "extractcode"

SRC_URI[md5sum] = "3a0eb10ab2a57e470a00fa854fb58ec4"
SRC_URI[sha256sum] = "58aa16d60cfcbd3695d7ea84a1e30d5ba9fa6f614b2ef4a6d0565b2ac5d4f757"

inherit pypi
inherit setuptools3
inherit native
