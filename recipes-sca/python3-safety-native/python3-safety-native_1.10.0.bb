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
SRC_URI[md5sum] = "f49e4c7caa36842357708627673d570a"
SRC_URI[sha256sum] = "2ebc71b44666588d7898905d86d575933fcd5fa3c92d301ed12482602b1e928a"

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
