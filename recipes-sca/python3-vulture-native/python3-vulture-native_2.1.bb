SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI_append = " file://vulture.sca.description"
SRC_URI[md5sum] = "4f3f1ece8bace2f9db4cdbc85bad4cdc"
SRC_URI[sha256sum] = "933bf7f3848e9e39ecab6a12faa59d5185471c887534abac13baea6fe8138cc2"

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
