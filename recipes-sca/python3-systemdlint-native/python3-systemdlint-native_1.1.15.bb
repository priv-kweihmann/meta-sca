SUMMARY = "Systemd Linter"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
            ${PYTHON_PN}-anytree-native \
            ${PYTHON_PN}-systemdunitparser-native \
           "

SRC_URI = "git://github.com/priv-kweihmann/systemdlint.git;protocol=https;branch=master \
           file://systemdlint.sca.description"
SRCREV = "75381b384b8a3cf041f4389bb7832979057553d7"
S = "${WORKDIR}/git/systemdlint"

inherit native
inherit sca-description
inherit setuptools3

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/systemdlint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
