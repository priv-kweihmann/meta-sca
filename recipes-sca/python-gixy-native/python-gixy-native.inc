SUMMARY = "Nginx configuration static analyzer"
DESCRIPTION = "Nginx configuration static analyzer"
HOMEPAGE = "https://github.com/yandex/gixy"
LICENSE = "MPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MPL-2.0;md5=815ca599c9df247a0c7f619bab123dad"

DEPENDS += "${PYTHON_PN}-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-cached-property-native \
            ${PYTHON_PN}-six-native \
            ${PYTHON_PN}-jinja2-native \
            ${PYTHON_PN}-configargparse-native"

REDEPDS += "${PYTHON_PN}-core ${PYTHON_PN}-argparse"

PYPI_PACKAGE = "gixy"

inherit pypi

FILES_${PN} += "${datadir}"
SRC_URI += "file://gixy.sca.description \
            file://gixy.sca.score \
            file://0001-No-argparse-needed.patch \
            file://0002-Add-root_dir-support.patch"

inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/gixy.sca.description ${D}${datadir}
    install ${WORKDIR}/gixy.sca.score ${D}${datadir}
}