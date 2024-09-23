SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

SRC_URI[md5sum] = "0c5ee3b3560f577b9a69a93c2b1e4e82"
SRC_URI[sha256sum] = "c35e98e992eb84b01cdadbfeb0aca2d44363e7dfe6c19416f65001ae69360ccc"

PYPI_PACKAGE = "vulture"

inherit pypi
inherit sca-description
inherit setuptools3
inherit_defer native

SCA_TOOL_DESCRIPTION = "vulture"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-logging \
    nativesdk-python3-stringold \
    nativesdk-python3-unittest \
"