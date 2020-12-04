SUMMARY = "Safety checks your installed dependencies for known security vulnerabilities"
HOMEPAGE = "https://github.com/pyupio/safety"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=558baaefeb02113f2331ea2fd536fa86"

DEPENDS += "\
            ${PYTHON_PN}-click-native \
            ${PYTHON_PN}-dparse2-native \
            ${PYTHON_PN}-packaging-native \
            ${PYTHON_PN}-pyparsing-native \
            ${PYTHON_PN}-requests-native \
            ${PYTHON_PN}-toml-native \
            "

SRC_URI_append = " file://safety.sca.description"
SRC_URI[md5sum] = "a419eb2a5123b83b94f365c14c498868"
SRC_URI[sha256sum] = "23bf20690d4400edc795836b0c983c2b4cbbb922233108ff925b7dd7750f00c9"

PYPI_PACKAGE = "safety"

inherit pypi
inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/safety.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
