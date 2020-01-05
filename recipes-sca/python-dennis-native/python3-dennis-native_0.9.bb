SUMMARY = "Dennis is a set of utilities for working with PO files to ease development and improve quality. "
DESCRIPTION = "Dennis is a set of utilities for working with PO files to ease development and improve quality. "
HOMEPAGE = "https://github.com/willkg/dennis"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5a174f6c1c019edada0f5a18bed0ff0f"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-click-native ${PYTHON_PN}-polib-native"

PYPI_PACKAGE = "dennis"

inherit native
inherit pypi
inherit sca-sanity
inherit setuptools3

SRC_URI += "file://dennis.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/dennis.sca.description ${D}${datadir}

    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}


SRC_URI[md5sum] = "2636710455435f612e8595c659e2c746"
SRC_URI[sha256sum] = "8c942dd5da7d03c65daebc069c5ee5c7f1374ac9b0c8c89c627caa66fe822604"
