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
SRC_URI[md5sum] = "94ac9077ad82ad919662c8167a83c10d"
SRC_URI[sha256sum] = "e0202e37756ed09daf4b0ba64ad2c245d357659e014c3f51d8cd0681ba66940a"

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
