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

SRC_URI[md5sum] = "3302cdabb58dca1871ec06d6435b5322"
SRC_URI[sha256sum] = "482f1329d4b6b9e52599754a2e502c0ed91ebdfd0992a2299b7fa136a6c12349"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "pylint"

## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP:${PN} += "file-rdeps"
