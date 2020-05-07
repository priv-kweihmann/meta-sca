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
SRC_URI[md5sum] = "54d69434af352a32b6c012d9812e37ae"
SRC_URI[sha256sum] = "8a627507ef9b307b46a1fea9513d5c98680ba09591253082b4c48697ba05a4ae"

PYPI_PACKAGE = "mypy"

inherit pypi
inherit sca-sanity
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/mypy.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
