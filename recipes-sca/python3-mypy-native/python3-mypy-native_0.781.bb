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
SRC_URI[md5sum] = "42bd7e74cb3257caadeed69b2c6ceb77"
SRC_URI[sha256sum] = "94bb664868b5cf4ca1147d875a4c77883d8c605cf2e916853006e4c6194f1e84"

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
