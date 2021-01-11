SUMMARY = "typecode provides file type detection functionality to ScanCode toolkit"
HOMEPAGE = "https://github.com/nexB/typecode"

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
             python3-typecode-libmagic-from-sources-native \
             python3-wheel-native \
            "

PYPI_PACKAGE = "typecode"

SRC_URI[md5sum] = "7a0f04e6e6c633aa011182e6b03a78b4"
SRC_URI[sha256sum] = "e7107ccf06b53312c16b806fd1c9f778c6cad8a29678c156084af966d7e61d55"

inherit pypi
inherit native
inherit setuptools3
