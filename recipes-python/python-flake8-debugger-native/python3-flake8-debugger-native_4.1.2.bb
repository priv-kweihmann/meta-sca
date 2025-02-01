SUMMARY = "flake8 debug statement checker"
HOMEPAGE = "https://github.com/jbkahn/flake8-debugger"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=5062d59f7c370e1fae388e102ca06095"

PYPI_PACKAGE = "flake8-debugger"

DEPENDS += "python3-flake8-native"

SRC_URI[md5sum] = "f5e7dbd23d72358d83942f97d8b68707"
SRC_URI[sha256sum] = "52b002560941e36d9bf806fca2523dc7fb8560a295d5f1a6e15ac2ded7a73840"

inherit pypi
inherit python_poetry_core
inherit_defer native

do_install:append() {
    rm -f ${D}${PYTHON_SITEPACKAGES_DIR}/pyproject.toml
}

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
"
