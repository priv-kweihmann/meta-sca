SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c107cf754550e65755c42985a5d4e9c9"

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
SRC_URI[md5sum] = "43b0e30e9527511bb2e12d8a75e463ec"
SRC_URI[sha256sum] = "0a049c5d47b629d9070c3932d13bff482b12119b6a241a93bc460b0be16953c8"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

do_install_append() {
    find ${D} -type f -exec sed -i "s#astroid==2.5.6#astroid>=2.5.6#g" {} \;

    install -d ${D}${datadir}
    install ${WORKDIR}/pylint.sca.description ${D}${datadir}
}

FILES_${PN} += "${datadir}"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP_${PN} += "file-rdeps"
