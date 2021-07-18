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

SRC_URI[md5sum] = "fd8a05c97bc3100cc0a845411da1406b"
SRC_URI[sha256sum] = "cf00757e4749eaea5b1e0753914d012e2b7a55ca2e05df6fa7a203315cca9789"

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
