SUMMARY = "Calculate code metrics in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/multimetric"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.Zlib;md5=b468464f86272d152a351096dfe81653"

DEPENDS += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"

PYPI_PACKAGE = "multimetric"

SRC_URI[sha256sum] = "0282204f3ffc48a9cff65cb36723e7f108595a369c3526afa196047640b102da"

inherit sca-description
inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "multimetric"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-core \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pygments \
    nativesdk-python3-statistics \
"
