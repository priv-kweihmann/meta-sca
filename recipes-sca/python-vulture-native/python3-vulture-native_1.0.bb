SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=236223e5e3d78373999d226cfb563000"

PYPI_PACKAGE = "vulture"

inherit native
inherit pypi
inherit sca-sanity
inherit setuptools3

SRC_URI += "file://vulture.sca.description"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/vulture.sca.description ${D}${datadir}
}

SRC_URI[md5sum] = "230261f74a2c445ad05589f2e60f3f75"
SRC_URI[sha256sum] = "4b5a8980c338e9c068d43e7164555a1e4c9c7d84961ce2bc6f3ed975f6e5bc9d"
