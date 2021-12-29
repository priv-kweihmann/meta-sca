SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17b7180fcfc43c4e70c07c71588604c4"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-tomli-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI:append = " file://mypy.sca.description"
SRC_URI[md5sum] = "868bd71776b93f81bd72e6a48bb18ae4"
SRC_URI[sha256sum] = "51426262ae4714cc7dd5439814676e0992b55bcc0f6514eccb4cf8e0678962c2"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/mypy.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
