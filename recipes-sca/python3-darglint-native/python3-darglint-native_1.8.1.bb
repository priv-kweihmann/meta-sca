SUMMARY = "A python documentation linter"
DESCRIPTION = "A python documentation linter which checks that the docstring description matches the definition"
HOMEPAGE = "https://github.com/terrencepreilly/darglint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=909f5d1d9b02b61f9a881c944b0ec36a"

SRC_URI += "git://github.com/terrencepreilly/darglint.git;branch=master;protocol=https"
SRCREV = "abc26b768cd7135d848223ba53f68323593c33d5"

inherit sca-description
inherit python_poetry_core
inherit_defer native

do_configure:prepend() {
    sed -i 's#poetry.masonry.api#poetry.core.masonry.api#g' ${S}/pyproject.toml
    sed -i 's#poetry>=#poetry_core>=#g' ${S}/pyproject.toml
}

SCA_TOOL_DESCRIPTION = "darglint"
PIP_INSTALL_PACKAGE = "darglint"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-asyncio \
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-flake8 \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-misc \
    nativesdk-python3-profile \
    nativesdk-python3-unittest \
"