SUMMARY = "typecode provides file type detection functionality to ScanCode toolkit"
HOMEPAGE = "https://github.com/nexB/typecode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
             python3-attrs-native \
             python3-binaryornot-native \
             python3-commoncode-native \
             python3-pdfminer-six-native \
             python3-plugincode-native \
             python3-setuptools-scm-native \
             python3-six-native \
             python3-toml-native \
             python3-typecode-libmagic-system-provided-native \
             python3-wheel-native \
            "

SRC_URI:append = " file://0001-Relax-typecode_libmagic-requirements.patch"

PYPI_PACKAGE = "typecode"

SRC_URI[md5sum] = "da4c8e1fa8df7f4cb73514498142f8c8"
SRC_URI[sha256sum] = "d3a82859df5607c900972e08e1bca31e3fe2daed37afd1b8231cad2ef613d8d6"

inherit pypi
inherit setuptools3
inherit native
