SUMMARY = "Meta recipe for flake8 and plugins"
DESCRIPTION = "Meta recipe for flake8 and plugins"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=8bef8e6712b1be5aa76af1ebde9d6378"

FILES_${PN} += "${datadir}"
SRC_URI += "file://flake8.sca.description \
            file://flake8.sca.score"

DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-flake8-comprehensions-native \
            ${PYTHON_PN}-flake8-eradicate-native \
            ${PYTHON_PN}-flake8-import-order-native \
            ${PYTHON_PN}-flake8-mutable-native \
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