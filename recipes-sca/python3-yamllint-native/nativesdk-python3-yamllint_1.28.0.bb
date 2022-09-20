SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    nativesdk-python3-pathspec \
    nativesdk-python3-pyyaml \
"

SRC_URI[md5sum] = "15fa99f647c1e7c729f3ecd27502d196"
SRC_URI[sha256sum] = "9e3d8ddd16d0583214c5fdffe806c9344086721f107435f68bad990e5a88826b"

PYPI_PACKAGE = "yamllint"

inherit pypi

inherit sca-description
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "yamllint"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pathspec \
    nativesdk-python3-pyyaml \
    nativesdk-python3-stringold \
"
