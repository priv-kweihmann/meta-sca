SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
            python3-pathspec-native \
            python3-pyyaml-native \
           "

SRC_URI[md5sum] = "0aa5eb302e1ca556338ac0089c773532"
SRC_URI[sha256sum] = "2d83f1d12f733e162a87e06b176149d7bb9c5bae4a9e5fce1c771d7f703f7a65"

PYPI_PACKAGE = "yamllint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "yamllint"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-pathspec \
    nativesdk-python3-pyyaml \
    nativesdk-python3-stringold \
"
