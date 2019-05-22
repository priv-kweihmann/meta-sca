SUMMARY = "An enterprise friendly way of detecting and preventing secrets in code. "
DESCRIPTION = "An enterprise friendly way of detecting and preventing secrets in code. "
HOMEPAGE = "https://github.com/Yelp/detect-secrets"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/Apache-2.0;md5=89aea4e17d99a7cacdbeed46a0096b10"

PYPI_PACKAGE = "detect_secrets"

DEPENDS += "${PYTHON_PN}-native ${PYTHON_PN}-pyyaml-native"

inherit native
inherit pypi

SRC_URI += "file://detectsecrets.sca.description \
            file://detectsecrets.sca.score"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/detectsecrets.sca.description ${D}${datadir}
    install ${WORKDIR}/detectsecrets.sca.score ${D}${datadir}
}
