SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=236223e5e3d78373999d226cfb563000"

SRC_URI_append = " file://vulture.sca.description"
SRC_URI[md5sum] = "49770e0d56e9f570e55d2b23f8d5fa8e"
SRC_URI[sha256sum] = "7ed28f87e6b08e62675946c96788f30f44da6882ad07f4af50485b65a0fac77a"

PYPI_PACKAGE = "vulture"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/vulture.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
