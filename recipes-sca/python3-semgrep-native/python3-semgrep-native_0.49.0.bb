SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780"

DEPENDS += "\
            python3-attrs-native \
            python3-colorama-native \
            python3-jsonschema-native \
            python3-packaging-native \
            python3-requests-native \
            python3-ruamelyaml-native \
            python3-ruamelyamlcli-native \
            python3-tqdm-native \
            python3-wheel-native \
            semgrep-core-native \
           "

SRC_URI_append = " file://semgrep.sca.description"

SRC_URI[md5sum] = "3e5edccc6e530c02763be1d43e8fd140"
SRC_URI[sha256sum] = "cca38e34824bdf17aeae6e7a8fc3ce0ac441fec51b207783a469fff9994eb08b"

PYPI_PACKAGE = "semgrep"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

export SEMGREP_SKIP_BIN = "1"

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/semgrep.sca.description ${D}${datadir}

    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}

FILES_${PN} += "${datadir}"
