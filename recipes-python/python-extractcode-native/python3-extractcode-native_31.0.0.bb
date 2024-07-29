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

SRC_URI[md5sum] = "428c307fc9199dfef2c3a284cacc03b0"
SRC_URI[sha256sum] = "80819392e9bcf8129f74d8904fe8a98c0dfed2782356842737282c0283113d88"

SRC_URI:append = " file://0001-setup.cfg-fix-invalid-version-spec.patch"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

