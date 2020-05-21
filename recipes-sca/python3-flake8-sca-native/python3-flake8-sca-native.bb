SUMMARY = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

DEPENDS += "\
            ${PYTHON_PN}-flake8-2020-native \
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-dlint-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-executable-native \
            ${PYTHON_PN}-flake8-expression-complexity-native \
            ${PYTHON_PN}-flake8-fixme-native \
            ${PYTHON_PN}-flake8-functions-native \
            ${PYTHON_PN}-flake8-import-order-native \
            ${PYTHON_PN}-flake8-mutable-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-requirements-native \
            ${PYTHON_PN}-flake8-strict-native \
            ${PYTHON_PN}-flake8-string-format-native \
            ${PYTHON_PN}-flake8-variables-names-native \
            ${PYTHON_PN}-wemake-python-styleguide-native \
            "

SRC_URI_append = " file://flake8.sca.description"

inherit native
inherit sca-description
inherit python3-dir

do_configure[noexec] = "1"
do_compile[noexec] = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/flake8.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
