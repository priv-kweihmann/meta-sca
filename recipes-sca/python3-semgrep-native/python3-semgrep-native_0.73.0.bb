SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

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

SRC_URI[md5sum] = "a19c79ff6261121c28ea84e6eb8b3a79"
SRC_URI[sha256sum] = "e8f4a1a4ab569e9a4df34add9b6a8612f15e6dc1a18479b6750153e2b8c377e9"

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
