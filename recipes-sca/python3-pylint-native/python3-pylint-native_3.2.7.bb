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
            python3-tomlkit-native \
            "

SRC_URI[md5sum] = "660e41d42d787b65e517028dd4f502e7"
SRC_URI[sha256sum] = "1b7a721b575eaeaa7d39db076b6e7743c993ea44f57979127c517c6c572c803e"

PYPI_PACKAGE = "pylint"

inherit pypi
inherit sca-description
inherit python_setuptools_build_meta
inherit_defer native

SCA_TOOL_DESCRIPTION = "pylint"

do_configure:prepend() {
    sed -i 's#setuptools~=[[:digit:]]\+\.[[:digit:]]\+\.[[:digit:]]\+#setuptools>=1.0.0#g' ${S}/pyproject.toml
    sed -i 's#setuptools>=[[:digit:]]\+\.[[:digit:]]\+\.[[:digit:]]\+#setuptools>=1.0.0#g' ${S}/pyproject.toml
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
