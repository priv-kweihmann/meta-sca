SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17b7180fcfc43c4e70c07c71588604c4"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-tomli-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI:append = " file://mypy.sca.description"
SRC_URI[md5sum] = "87b21a4c4da6f2c92eb2175d8521499f"
SRC_URI[sha256sum] = "a55438627f5f546192f13255a994d6d1cf2659df48adcf966132b4379fd9c86b"

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
