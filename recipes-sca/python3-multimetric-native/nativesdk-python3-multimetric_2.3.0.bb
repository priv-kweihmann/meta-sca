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

SRC_URI[sha256sum] = "efba34c3051225319d5f5d39e7d3c5fcc8a3abd7603ba3627c5d066bfdc3830f"

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
