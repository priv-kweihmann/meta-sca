SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6afb7c151c4dedb5c3dc292cc120fadc"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI_append = " file://mypy.sca.description"
SRC_URI[md5sum] = "2e92a8ce0ff0dfc9cee059b4fcccdfc4"
SRC_URI[sha256sum] = "2b21ba45ad9ef2e2eb88ce4aeadd0112d0f5026418324176fd494a6824b74975"

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
