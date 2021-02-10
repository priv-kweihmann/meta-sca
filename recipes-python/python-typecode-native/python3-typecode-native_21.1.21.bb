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

SRC_URI[md5sum] = "a4686d82ded6f87a7ebf306db2893b91"
SRC_URI[sha256sum] = "e25225edf330ed14762d78856997e7cadf5b3eb6b4689a6db2a48ee23e1d4dec"

inherit pypi
inherit setuptools3
inherit native
