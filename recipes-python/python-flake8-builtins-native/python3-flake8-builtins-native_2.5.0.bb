SUMMARY = "Check for python builtins being used as variables or parameters"
HOMEPAGE = "https://github.com/gforcada/flake8-builtins"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "GPL-2.0-only"
LIC_FILES_CHKSUM = "file://LICENSE;md5=b234ee4d69f5fce4486a80fdaf4a4263"

DEPENDS += "\
            python3-flake8-native \
            python3-mccabe-native \
            python3-pycodestyle-native \
            python3-pyflakes-native \
            "

PYPI_PACKAGE = "flake8_builtins"

SRC_URI[md5sum] = "e00203cbf113b875435d0ad56394991c"
SRC_URI[sha256sum] = "bdaa3dd823e4f5308c5e712d19fa5f69daa52781ea874f5ea9c3637bcf56faa6"

inherit pypi
inherit python_hatchling
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-mccabe \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-pyflakes \
"
