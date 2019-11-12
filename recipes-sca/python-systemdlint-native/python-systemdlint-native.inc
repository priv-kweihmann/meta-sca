SUMMARY = "Systemd Linter"
DESCRIPTION = "Systemd Linter"
HOMEPAGE = "https://github.com/priv-kweihmann/systemdlint"

SRC_URI = "git://github.com/priv-kweihmann/systemdlint.git;protocol=https;branch=master;tag=${PV} \
           file://systemdlint.sca.description \
           file://systemdlint.sca.score"

S = "${WORKDIR}/git/systemdlint"
B = "${S}"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://${WORKDIR}/git/LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

inherit native

DEPENDS += "${PYTHON_PN}-systemdunitparser-native ${PYTHON_PN}-anytree-native"

RDEPENDS_${PN} += "${PYTHON_PN}-core-native"

FILES_${PN} += "${datadir}"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/systemdlint.sca.description ${D}${datadir}
    install ${WORKDIR}/systemdlint.sca.score ${D}${datadir}
}
