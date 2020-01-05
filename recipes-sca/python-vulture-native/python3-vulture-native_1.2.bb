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

SRC_URI[md5sum] = "70abb6433d157618f76465e5232dbae2"
SRC_URI[sha256sum] = "c200a01ec47c05d75c5feffe096aeb85a4d3f0e18563be125fae72c13b584ea5"
