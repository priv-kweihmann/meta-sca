SUMMARY = "Calculate code metrics in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/multimetric"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Zlib"
LIC_FILES_CHKSUM = "file://LICENSE.Zlib;md5=b468464f86272d152a351096dfe81653"

DEPENDS += "\
            python3-chardet-native \
            python3-pygments-native \
            "

PYPI_PACKAGE = "multimetric"

SRC_URI[sha256sum] = "7531efefed39a3f156673f46537f623ff4a6e22988c8b4aa86419f93a58f2f2e"

inherit sca-description
inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

SCA_TOOL_DESCRIPTION = "multimetric"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-core \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pygments \
    nativesdk-python3-statistics \
"
