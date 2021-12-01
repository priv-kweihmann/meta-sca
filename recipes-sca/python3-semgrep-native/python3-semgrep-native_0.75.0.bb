SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

DEFAULT_PREFERENCE = "-1"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1-only;md5=1a6d268fd218675ffea8be556788b780"

DEPENDS += "\
            python3-attrs-native \
            python3-click-native \
            python3-click-option-group-native \
            python3-colorama-native \
            python3-jsonschema-native \
            python3-packaging-native \
            python3-peewee-native \
            python3-requests-native \
            python3-ruamelyaml-native \
            python3-ruamelyamlcli-native \
            python3-tqdm-native \
            python3-wcmatch-native \
            python3-wheel-native \
            semgrep-core-native \
           "

SRC_URI:append = " file://semgrep.sca.description"

SRC_URI[md5sum] = "2a36bbabb56c3247f772b8a0787bbc4e"
SRC_URI[sha256sum] = "9a85eb0ab5e08938cbee117a602fb3e5313cbf336bf1f378b4f936439547e036"

PYPI_PACKAGE = "semgrep"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

export SEMGREP_SKIP_BIN = "1"

do_configure:prepend() {
    # Remove the version pinning
    sed -i "s#jsonschema~=3.2.0#jsonschema>=3.2.0#g" "${S}/setup.py"
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/semgrep.sca.description ${D}${datadir}

    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}

FILES:${PN} += "${datadir}"
