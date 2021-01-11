SUMMARY = "Safety checks your installed dependencies for known security vulnerabilities"
HOMEPAGE = "https://github.com/pyupio/safety"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=558baaefeb02113f2331ea2fd536fa86"

DEPENDS += "\
            python3-click-native \
            python3-dparse2-native \
            python3-packaging-native \
            python3-pyparsing-native \
            python3-requests-native \
            python3-toml-native \
            "

SRC_URI_append = " file://safety.sca.description"
SRC_URI[md5sum] = "48e5d17516587e16e89844498e669a06"
SRC_URI[sha256sum] = "9e35be579f7589cde300faaf947eefb6a4c1a63ae2a79edb370805ef99487c5f"

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
