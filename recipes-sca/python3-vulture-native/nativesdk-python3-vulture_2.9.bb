SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI[md5sum] = "9af772bd50c8913984eda224e2dc0075"
SRC_URI[sha256sum] = "0f4d86ba515e67db2860539894edb4e387b25696f831234826dd72c636f0331f"

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