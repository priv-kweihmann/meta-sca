SUMMARY = "Pylint is a tool that checks for errors in Python code"
HOMEPAGE = "https://github.com/PyCQA/pylint"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c107cf754550e65755c42985a5d4e9c9"

DEPENDS += "\
    nativesdk-python3 \
    nativesdk-python3-astroids \
    nativesdk-python3-dill \
    nativesdk-python3-isort \
    nativesdk-python3-mccabe \
    nativesdk-python3-platformdirs \
    nativesdk-python3-six \
    nativesdk-python3-tomlkit \
    python3-pytest-runner-native \
    python3-toml-native \
"

SRC_URI[md5sum] = "ddbe1fbc3512460bf6278cf4c97e0d2a"
SRC_URI[sha256sum] = "e9b7171e242dcc6ebd0aaa7540481d1a72860748a0a7816b8fe6cf6c80a6fe7e"

PYPI_PACKAGE = "pylint"

inherit pypi

inherit sca-description
inherit python_setuptools_build_meta
inherit_defer nativesdk
SCA_TOOL_DESCRIPTION = "pylint"
do_configure:prepend() {
    sed -i 's#setuptools~=#setuptools>=#g' ${S}/pyproject.toml
    sed -i 's#wheel~=#wheel>=#g' ${S}/pyproject.toml
}
## A python file with /usr/bin/python-shebang is
## used - ignore this error
INSANE_SKIP:${PN} += "file-rdeps"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-astroids \
    nativesdk-python3-core \
    nativesdk-python3-datetime \
    nativesdk-python3-dill \
    nativesdk-python3-io \
    nativesdk-python3-isort \
    nativesdk-python3-json \
    nativesdk-python3-mccabe \
    nativesdk-python3-numbers \
    nativesdk-python3-pickle \
    nativesdk-python3-pip \
    nativesdk-python3-platformdirs \
    nativesdk-python3-profile \
    nativesdk-python3-pytest \
    nativesdk-python3-shell \
    nativesdk-python3-six \
    nativesdk-python3-stringold \
    nativesdk-python3-tomlkit \
    nativesdk-python3-unittest \
"
