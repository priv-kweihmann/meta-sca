SUMMARY = "Meta recipe for flake8 and plugins"
DESCRIPTION = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${SCA_LAYERDIR}/LICENSE;md5=e926c89aceef6c1a4247d5df08f94533"

FILES_${PN} += "${datadir}"
SRC_URI += "file://flake8.sca.description \
            file://flake8.sca.score"

DEPENDS += "\
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-dlint \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-import-order-native \
            ${PYTHON_PN}-flake8-mutable-native \
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-quotes-native \
            ${PYTHON_PN}-flake8-string-format-native \
            "

inherit native

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