SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI[md5sum] = "79088b5fd3ca49175ec3edfab4329b78"
SRC_URI[sha256sum] = "b6a2aa632b6fd51488a8eeac650ab4a509bb1a032e81943817a8a2e6a63a30b3"

PYPI_PACKAGE = "vulture"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "vulture"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-logging \
    nativesdk-python3-stringold \
    nativesdk-python3-toml \
    nativesdk-python3-unittest \
"