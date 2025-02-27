SUMMARY = "A Flake8 plugin to identify incorrect use of encodings"
HOMEPAGE = "https://github.com/python-formate/flake8-encodings"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
DEPENDS += "\
    nativesdk-python3-astatine \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-helper \
    python3-domdf-python-tools-native \
    python3-whey-native \
"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d5cb1e8b7fd3a80b465d13176949a8b"

SRC_URI[sha256sum] = "f42bb26d6b46f298affff247d57b0578812120c838b4f299fb07b41285c82b4e"

inherit pypi
inherit pypi-old
inherit python_pep517
inherit python3native
inherit setuptools3-base
inherit_defer nativesdk

python_pep517_do_compile () {
    nativepython3 -m whey --out-dir ${PEP517_WHEEL_PATH} --wheel ${PEP517_BUILD_OPTS} ${PEP517_SOURCE_PATH}
}

PYPI_PACKAGE = "flake8-encodings"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-astatine \
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-flake8-helper \
"
