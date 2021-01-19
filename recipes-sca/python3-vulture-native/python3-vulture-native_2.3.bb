SUMMARY = "Find dead Python code"
HOMEPAGE = "https://github.com/jendrikseipp/vulture"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7742d436e18716a43014253ae9f16b7e"

DEPENDS += "python3-toml-native"

SRC_URI_append = " file://vulture.sca.description"
SRC_URI[md5sum] = "4f9b49b480e65eea61f26af9b3a00daa"
SRC_URI[sha256sum] = "03d5a62bcbe9ceb9a9b0575f42d71a2d414070229f2e6f95fa6e7c71aaaed967"

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
