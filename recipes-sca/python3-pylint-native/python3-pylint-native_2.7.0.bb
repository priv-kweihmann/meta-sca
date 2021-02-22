SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=c107cf754550e65755c42985a5d4e9c9"

DEPENDS += "\
            python3-astroids-native \
            python3-isort-native \
            python3-mccabe-native \
            python3-native \
            python3-pytest-runner-native \
            python3-six-native \
            python3-toml-native \
            "

SRC_URI_append = " file://pylint.sca.description"
SRC_URI[md5sum] = "2566fc12ad1b086c765123247acd1e2c"
SRC_URI[sha256sum] = "2e0c6749d809985e4f181c336a8f89b2b797340d8049160bf95f35a3f0ecf6fc"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    install -d ${D}${datadir}
    install ${WORKDIR}/pylint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"
