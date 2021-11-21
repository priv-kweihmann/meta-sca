SUMMARY = "Python type inferencer"
HOMEPAGE = "https://google.github.io/pytype/"

DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=23a2cfaba162d74b289e2cac209dfa88"

DEPENDS += "\
            cmake-native \
            python3-attrs-native \
            python3-importlab-native \
            python3-libcst-native \
            python3-ninja-native \
            python3-pybind11-native \
            python3-pylint-native \
            python3-pyyaml-native \
            python3-scikit-build-native \
            python3-six-native \
            python3-tabulate-native \
            python3-typed-ast-native \
            "

SRC_URI:append = " file://pytype.sca.description"
SRC_URI[md5sum] = "19d32e344f14cebfea00abad9d1ffe08"
SRC_URI[sha256sum] = "b9766f0866fb74ebc80c90ed91691b4a1d7af407212ff90f1284de118bdf0b9b"

PYPI_PACKAGE = "pytype"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_configure:prepend() {
    sed -i "/ninja/d" ${S}/setup.cfg
}

do_install:append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pytype.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"
