SUMMARY = "PO files linter to ease development and improve quality"
DESCRIPTION = "Dennis is a set of utilities for working with PO files to ease development and improve quality"
HOMEPAGE = "https://github.com/willkg/dennis"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5a174f6c1c019edada0f5a18bed0ff0f"

DEPENDS += "\
            python3-click-native \
            python3-native \
            python3-polib-native \
           "

SRC_URI_append = " file://dennis.sca.description"
SRC_URI[md5sum] = "2636710455435f612e8595c659e2c746"
SRC_URI[sha256sum] = "8c942dd5da7d03c65daebc069c5ee5c7f1374ac9b0c8c89c627caa66fe822604"

PYPI_PACKAGE = "dennis"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/dennis.sca.description ${D}${datadir}

    ## This otherwise collides with other modules
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests/
}

FILES_${PN} += "${datadir}"
