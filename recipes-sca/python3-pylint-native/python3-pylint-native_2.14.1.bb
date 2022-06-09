SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c107cf754550e65755c42985a5d4e9c9"

DEPENDS += "\
            python3-astroids-native \
            python3-dill-native \
            python3-isort-native \
            python3-mccabe-native \
            python3-native \
            python3-platformdirs-native \
            python3-pytest-runner-native \
            python3-six-native \
            python3-toml-native \
            python3-tomlkit-native \
            "

SRC_URI[md5sum] = "1f83dedf2eb2f676a246ba829c2af7b8"
SRC_URI[sha256sum] = "549261e0762c3466cc001024c4419c08252cb8c8d40f5c2c6966fea690e7fe2a"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "pylint"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP:${PN} += "file-rdeps"
