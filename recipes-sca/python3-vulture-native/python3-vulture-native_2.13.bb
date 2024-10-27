SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

SRC_URI[md5sum] = "5bae9774eece2fd72de30476c5cd888a"
SRC_URI[sha256sum] = "78248bf58f5eaffcc2ade306141ead73f437339950f80045dce7f8b078e5a1aa"

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