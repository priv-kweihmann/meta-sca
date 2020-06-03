SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6afb7c151c4dedb5c3dc292cc120fadc"

DEPENDS += "\
            ${PYTHON_PN}-mypy-extensions-native \
            ${PYTHON_PN}-typed-ast-native \
            ${PYTHON_PN}-typing-extensions-native \
            "

SRC_URI_append = " file://mypy.sca.description"
SRC_URI[md5sum] = "6593d2eac38b72d1801660b7f70bab92"
SRC_URI[sha256sum] = "4ef13b619a289aa025f2273e05e755f8049bb4eaba6d703a425de37d495d178d"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/mypy.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
