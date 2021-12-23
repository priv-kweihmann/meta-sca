SUMMARY = "Safety checks your installed dependencies for known security vulnerabilities"
HOMEPAGE = "https://github.com/pyupio/safety"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=558baaefeb02113f2331ea2fd536fa86"

DEPENDS += "\
            python3-click-native \
            python3-dparse-native \
            python3-packaging-native \
            python3-pyparsing-native \
            python3-requests-native \
            python3-toml-native \
            "

SRC_URI:append = " file://safety.sca.description"
SRC_URI[md5sum] = "d3fcda6267ed49ad8786699b08cd69ef"
SRC_URI[sha256sum] = "30e394d02a20ac49b7f65292d19d38fa927a8f9582cdfd3ad1adbbc66c641ad5"

PYPI_PACKAGE = "safety"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/safety.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
