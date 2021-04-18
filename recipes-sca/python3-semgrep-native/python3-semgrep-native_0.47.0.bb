SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

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

SRC_URI[md5sum] = "54090d94962207dc0df9338d273aff3e"
SRC_URI[sha256sum] = "79e9ece37e8a0e15db38fa468d6ccf4b6eeef5d60bddba16beb88f4d71cdf22b"

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
