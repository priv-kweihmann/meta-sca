SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI[md5sum] = "6a7a58aed658329313e622213eac7c26"
SRC_URI[sha256sum] = "2515fa848181001dc8a73aba6a01a1a17406f5d372f24ec7f7191866f9f4997e"

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