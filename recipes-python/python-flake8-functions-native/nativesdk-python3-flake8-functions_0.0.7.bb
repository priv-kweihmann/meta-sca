SUMMARY = "flake8 plugin for validation of function parameters (length, complexity, etc)"
HOMEPAGE = "https://github.com/best-doctor/flake8-functions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=352fd8fef192c98968c70971a80f959c"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-mr-proper \
    nativesdk-python3-setuptools \
"

PYPI_PACKAGE = "flake8_functions"
UPSTREAM_CHECK_REGEX ?= "/flake8-functions/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[sha256sum] = "40584b05d57e5ab185545bcfa08aa0edca52b04646d0df266e2b1667d6437184"

inherit pypi
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-mr-proper \
    nativesdk-python3-setuptools \
"
