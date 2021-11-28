SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

DEFAULT_PREFERENCE = "-1"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c107cf754550e65755c42985a5d4e9c9"

DEPENDS += "\
            python3-astroids-native \
            python3-isort-native \
            python3-mccabe-native \
            python3-native \
            python3-platformdirs-native \
            python3-pytest-runner-native \
            python3-six-native \
            python3-toml-native \
            "

SRC_URI:append = " file://pylint.sca.description"
SRC_URI[md5sum] = "859eedddfec8393d88d2bbbb49219ab2"
SRC_URI[sha256sum] = "4f4a52b132c05b49094b28e109febcec6bfb7bc6961c7485a5ad0a0f961df289"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install:append() {
    find ${D} -type f -exec sed -i "s#astroid==2.5.6#astroid>=2.5.6#g" {} \;

    install -d ${D}${datadir}
    install ${WORKDIR}/pylint.sca.description ${D}${datadir}
}

FILES:${PN} += "${datadir}"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP:${PN} += "file-rdeps"
