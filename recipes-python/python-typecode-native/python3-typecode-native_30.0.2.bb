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
             python3-typecode-libmagic-system-provided-native \
             python3-wheel-native \
            "

PYPI_PACKAGE = "typecode"

SRC_URI[md5sum] = "e1c9b01c020cdeabc625575ba804d250"
SRC_URI[sha256sum] = "17689d20af0ae6116e797ef2c5de65f0ce809128cf0e68479b34bd6ba4bc3898"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

