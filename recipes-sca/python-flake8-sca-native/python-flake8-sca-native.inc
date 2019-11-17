SUMMARY = "Meta recipe for flake8 and plugins"
DESCRIPTION = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=a4a2bbea1db029f21b3a328c7a059172"

FILES_${PN} += "${datadir}"
SRC_URI += "file://flake8.sca.description \
            file://flake8.sca.score"

DEPENDS += "\
            ${PYTHON_PN}-cohesion-native \
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-dlint-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-import-order-native \
            ${PYTHON_PN}-flake8-mutable-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-string-format-native \
            "

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
    install ${WORKDIR}/flake8.sca.score ${D}${datadir}
}