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

SRC_URI[md5sum] = "b4b43e80971979831ca2b059733737c7"
SRC_URI[sha256sum] = "4da42bee8968906fb1f47c64008817515baec8ccff0c31746d1573103a6e920c"
