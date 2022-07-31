SUMMARY = "html5lib is a pure-python library for parsing HTML"
HOMEPAGE = "https://github.com/html5lib/html5lib-python"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ba5ada9e6fead1fdc32f43c9f10ba7c"

DEPENDS += "\
    nativesdk-python3-six \
    nativesdk-python3-webencodings \
"

PYPI_PACKAGE = "html5lib"

SRC_URI[md5sum] = "6748742e2ec4cb99287a6bc82bcfe2b0"
SRC_URI[sha256sum] = "b2e5b40261e20f354d198eae92afc10d750afb487ed5e50f9c4eaf07c184146f"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-six \
    nativesdk-python3-webencodings \
"
