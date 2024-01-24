SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI[md5sum] = "03f1ea5a5c6d60879ad488d8c37143b3"
SRC_URI[sha256sum] = "f0fbb60bce6511aad87ee0736c502456737490a82d919a44e6d92262cb35f1c2"

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