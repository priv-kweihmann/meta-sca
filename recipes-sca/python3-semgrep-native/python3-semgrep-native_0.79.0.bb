SUMMARY = "Lightweight static analysis for many languages"
HOMEPAGE = "https://github.com/returntocorp/semgrep"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/LGPL-2.1;md5=1a6d268fd218675ffea8be556788b780"

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

SRC_URI[md5sum] = "5d67afb61511cb860b5a3a497c4f7fbb"
SRC_URI[sha256sum] = "42f6ae168fae2c742cc8aff93d61d7c8264fbc2138760f34920b4452fe2abd1f"

PYPI_PACKAGE = "semgrep"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "semgrep"

export SEMGREP_SKIP_BIN = "1"

do_configure:prepend() {
    # Remove the version pinning
    sed -i "s#jsonschema~=3.2.0#jsonschema>=3.2.0#g" "${S}/setup.py"
}

do_install:append() {
    # remove test files
    rm -rf ${D}${PYTHON_SITEPACKAGES_DIR}/tests
}
