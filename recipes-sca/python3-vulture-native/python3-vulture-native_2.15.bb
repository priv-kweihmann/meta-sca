SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

SRC_URI[md5sum] = "9a27255eb44a93c29593ee4721cee351"
SRC_URI[sha256sum] = "f9d8b4ce29c69950d323f21dceab4a4d6c694403dffbed7713c4691057e561fe"

PYPI_PACKAGE = "vulture"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

SCA_TOOL_DESCRIPTION = "vulture"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-logging \
    nativesdk-python3-stringold \
    nativesdk-python3-unittest \
"