SUMMARY = "typecode provides file type detection functionality to ScanCode toolkit"
HOMEPAGE = "https://github.com/nexB/typecode"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=e23fadd6ceef8c618fc1c65191d846fa"

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

SRC_URI[md5sum] = "b6d54109454702eb2703820c333ec16e"
SRC_URI[sha256sum] = "214d633804fc3e79b7cc8e2152baadfdcd62cfe02056ba797d2e5a388d4c9f95"

inherit pypi
inherit native
inherit setuptools3
