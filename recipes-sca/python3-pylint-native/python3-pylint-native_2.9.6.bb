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
SRC_URI[md5sum] = "7af6933458f80e286fbc5ef553a1bda7"
SRC_URI[sha256sum] = "8b838c8983ee1904b2de66cce9d0b96649a91901350e956d78f289c3bc87b48e"

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
