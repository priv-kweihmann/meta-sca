SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

SRC_URI[md5sum] = "ee127c369a4b3da107c021e0a210a7d4"
SRC_URI[sha256sum] = "f8d9f6e2af03011664a3c6c240c9765b3f392917d3135fddca6d6a68d359f717"

PYPI_PACKAGE = "vulture"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "vulture"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-ctypes \
    nativesdk-python3-logging \
    nativesdk-python3-stringold \
    nativesdk-python3-unittest \
"