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
SRC_URI[md5sum] = "277040459175f085312022b7825a4e1d"
SRC_URI[sha256sum] = "f2ab09596ebcbb4012fb7345d2dbda28319c8f3c2731ef6e27ba206b279c13b2"

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
