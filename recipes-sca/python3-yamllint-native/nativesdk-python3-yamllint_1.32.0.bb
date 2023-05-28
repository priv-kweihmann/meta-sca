SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    nativesdk-python3-pathspec \
    nativesdk-python3-pyyaml \
"

SRC_URI[md5sum] = "01a56a96e10a4b9bbe75903b28fe9426"
SRC_URI[sha256sum] = "d01dde008c65de5b235188ab3110bebc59d18e5c65fc8a58267cd211cd9df34a"

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
