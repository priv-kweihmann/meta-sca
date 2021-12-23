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

SRC_URI:append = " file://0001-Remove-strict-versioning-of-plugins.patch"

PYPI_PACKAGE = "extractcode"

SRC_URI[md5sum] = "90313a1b6336f12bb3502b94345254ff"
SRC_URI[sha256sum] = "5a660d1b9e3bae4aa87828e6947dc3b31dc2fa6705acb28a514874602b40bc90"

inherit pypi
inherit setuptools3
inherit native
