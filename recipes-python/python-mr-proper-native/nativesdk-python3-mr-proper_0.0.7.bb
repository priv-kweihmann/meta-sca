SUMMARY = "Static Python code analyzer"
HOMEPAGE = "https://github.com/best-doctor/mr_proper"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0f11c6d8f4ab2580d92ae26f11135767"

DEPENDS += "\
    nativesdk-python3-click \
    nativesdk-python3-setuptools \
    nativesdk-python3-stdlib-list \
"

PYPI_PACKAGE = "mr-proper"

SRC_URI[sha256sum] = "03b517b19e617537f711ce418b125e5f2efd82ec881539cdee83195c78c14a02"

inherit pypi
inherit pypi-old
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-click \
    nativesdk-python3-setuptools \
    nativesdk-python3-stdlib-list \
"
