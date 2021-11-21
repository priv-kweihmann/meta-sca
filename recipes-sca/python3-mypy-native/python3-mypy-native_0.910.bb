SUMMARY = "Optional static typing for Python 3 and 2 (PEP 484)"
HOMEPAGE = "https://github.com/python/mypy"

DEFAULT_PREFERENCE = "-1"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=17b7180fcfc43c4e70c07c71588604c4"

DEPENDS += "\
            python3-mypy-extensions-native \
            python3-toml-native \
            python3-typed-ast-native \
            python3-typing-extensions-native \
            "

SRC_URI:append = " file://mypy.sca.description"
SRC_URI[md5sum] = "cb65b89ecc36f0b01f264b424154fb46"
SRC_URI[sha256sum] = "704098302473cb31a218f1775a873b376b30b4c18229421e9e9dc8916fd16150"

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
