SUMMARY = "Find dead Python code"

HOMEPAGE = "https://github.com/jendrikseipp/vulture"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=236223e5e3d78373999d226cfb563000"

PYPI_PACKAGE = "vulture"

inherit native
inherit pypi
inherit sca-sanity

SRC_URI += "file://vulture.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/vulture.sca.description ${D}${datadir}
}
