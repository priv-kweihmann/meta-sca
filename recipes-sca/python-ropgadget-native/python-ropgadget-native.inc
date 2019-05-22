SUMMARY = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
DESCRIPTION = "This tool lets you search your gadgets on your binaries to facilitate your ROP exploitation."
HOMEPAGE = "https://github.com/JonathanSalwan/ROPgadget"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "ROPGadget"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-capstone-native"

inherit native
inherit pypi

SRC_URI += "file://ropgadget.sca.description \
            file://ropgadget.sca.score"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/ropgadget.sca.description ${D}${datadir}
    install ${WORKDIR}/ropgadget.sca.score ${D}${datadir}
}
