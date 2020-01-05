inherit python3-dir
SUMMARY = "Meta recipe for flake8 and plugins"
DESCRIPTION = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

FILES_${PN} += "${datadir}"
SRC_URI += "file://flake8.sca.description"

DEPENDS += "\
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-dlint-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-flake8-import-order-native \
            ${PYTHON_PN}-flake8-mutable-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-string-format-native \
            ${PYTHON_PN}-wemake-python-styleguide-native \
            "

## If we have python 3.6+ additionally enable the following
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-2020-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-fixme-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-strict-native', '')}"
DEPENDS += "${@oe.utils.ifelse(float(d.getVar('PYTHON_BASEVERSION') or '0.0') >= 3.6, '${PYTHON_PN}-flake8-variables-names-native', '')}"

inherit native
inherit sca-sanity

do_configure() {
    :
}

do_compile() {
    :
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flake8.sca.description ${D}${datadir}
}
