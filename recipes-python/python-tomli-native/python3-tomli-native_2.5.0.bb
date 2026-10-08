SUMMARY = "A lil' TOML parser"
HOMEPAGE = "https://github.com/hukkin/tomli"
BUGTRACKER = "https://github.com/hukkin/tomli/issues"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=aaaaf0879d17df0110d1aa8c8c9f46f5"

inherit pypi
inherit python_flit_core
inherit_defer native

PYPI_PACKAGE = "tomli"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
SRC_URI[sha256sum] = "264507556cd8b8c8e7c6ee037cdf443a463f03f4c958e57195e3d369711b8ff6"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-datetime \
    nativesdk-python3-stringold \
"
