SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            python3-attrs-native \
            python3-importlab-native \
            python3-ninja-native \
            python3-pybind11-native \
            python3-pylint-native \
            python3-pyyaml-native \
            python3-scikit-build-native \
            python3-six-native \
            python3-typed-ast-native \
            cmake-native \
            "

SRC_URI_append = " file://pytype.sca.description"
SRC_URI[md5sum] = "1943f2c305f3af3a11257e989a30c968"
SRC_URI[sha256sum] = "b79c7c0c9a9df767887bc50c96c1391c9ff3ceacf2a5f3b49ecf57b1d3d86a64"

PYPI_PACKAGE = "pytype"

inherit native
inherit pypi
inherit sca-description
inherit setuptools3

do_configure_prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
