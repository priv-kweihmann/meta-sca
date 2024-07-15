SUMMARY = "Some handy helper functions for Python's AST module"
HOMEPAGE = "https://github.com/python-formate/astatine"

DEPENDS += "\
	python3-asttokens-native \
	python3-domdf-python-tools-native \
	python3-whey-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1d5cb1e8b7fd3a80b465d13176949a8b"

SRC_URI[sha256sum] = "0c58a7844b5890ff16da07dbfeb187341d8324cb4378940f89d795cbebebce08"

inherit pypi
inherit python_pep517
inherit python3native
inherit setuptools3-base
inherit_defer native

python_pep517_do_compile () {
    nativepython3 -m whey --out-dir ${PEP517_WHEEL_PATH} --wheel ${PEP517_BUILD_OPTS} ${PEP517_SOURCE_PATH}
}

PYPI_PACKAGE = "astatine"
