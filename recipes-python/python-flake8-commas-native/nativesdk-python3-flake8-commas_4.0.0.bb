SUMMARY = "Flake8 lint for trailing commas"
HOMEPAGE = "https://github.com/PyCQA/flake8-commas/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c816149279ec41ec9d1cba44cbd47b03"

DEPENDS += "nativesdk-python3-flake8"

SRC_URI[sha256sum] = "a68834b42a9a31c94ca790efe557a932c0eae21a3479c6b9a23c4dc077e3ea96"

PYPI_PACKAGE = "flake8_commas"

inherit setuptools3
inherit pypi
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
