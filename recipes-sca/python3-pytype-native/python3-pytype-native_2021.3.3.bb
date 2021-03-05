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
SRC_URI[md5sum] = "84b948570f2c518e1f4288c68a29832d"
SRC_URI[sha256sum] = "d8f7808c8bba99e5eda02d1ffb7c4dcf679467d01d0510b9884141e9edb57c30"

PYPI_PACKAGE = "pytype"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_configure_prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"
