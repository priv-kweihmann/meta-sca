SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=236223e5e3d78373999d226cfb563000"

SRC_URI_append = " file://vulture.sca.description"
SRC_URI[md5sum] = "c0576c3291e295b52bae909e42bec617"
SRC_URI[sha256sum] = "07dfab84a32867ae2636bb3998ce50a4e059556dacb0cca4dbe51a1f3cc9d6d7"

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
