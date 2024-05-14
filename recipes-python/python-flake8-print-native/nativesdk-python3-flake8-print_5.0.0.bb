SUMMARY = "print statement checker plugin for flake8"
HOMEPAGE = "https://github.com/jbkahn/flake8-print"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=5062d59f7c370e1fae388e102ca06095"

DEPENDS += "\
    nativesdk-python3-flake8 \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-six \
"

PYPI_PACKAGE = "flake8-print"

SRC_URI[md5sum] = "b541b0ca61010d3a6fa91a3fb1400a06"
SRC_URI[sha256sum] = "76915a2a389cc1c0879636c219eb909c38501d3a43cc8dae542081c9ba48bdf9"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-core \
    nativesdk-python3-flake8 \
    nativesdk-python3-pycodestyle \
    nativesdk-python3-six \
"
