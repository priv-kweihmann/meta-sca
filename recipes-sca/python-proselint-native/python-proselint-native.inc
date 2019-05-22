SUMMARY = "A linter for prose."
DESCRIPTION = "A linter for prose."
HOMEPAGE = "https://github.com/amperser/proselint/"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=64a578e1ca1f25248a8d50f32fdf14e7"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-future-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-click-native"

PYPI_PACKAGE = "proselint"

inherit pypi

FILES_${PN} += "${datadir}"
SRC_URI += "file://proselint.sca.description \
            file://proselint.sca.score"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/proselint.sca.description ${D}${datadir}
    install ${WORKDIR}/proselint.sca.score ${D}${datadir}
}