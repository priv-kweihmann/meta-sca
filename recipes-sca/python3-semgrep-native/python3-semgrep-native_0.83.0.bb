SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1-only"
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

SRC_URI[md5sum] = "27077327e618b282b77aa749b43cb065"
SRC_URI[sha256sum] = "e2e60d37d1f2f27a63d93693ec01dba6e3876fed0ec8144a296c1fa7770d983a"

PYPI_PACKAGE = "semgrep"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "semgrep"

export SEMGREP_SKIP_BIN = "1"

do_configure:prepend() {
    # Remove the version pinning
    sed -i "s#~=#>=#g" "${S}/setup.py"
}

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
