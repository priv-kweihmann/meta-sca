SUMMARY = "A linter for YAML files"
HOMEPAGE = "https://github.com/adrienverge/yamllint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-3.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"

DEPENDS += "\
    nativesdk-python3-pathspec \
    nativesdk-python3-pyyaml \
"

SRC_URI[md5sum] = "2809311c341a082d656963c95c76d541"
SRC_URI[sha256sum] = "66a755d5fbcbb8831f1a9568676329b5bac82c37995bcc9afd048b6459f9fa48"

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
