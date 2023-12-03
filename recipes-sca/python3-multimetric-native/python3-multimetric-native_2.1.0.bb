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

SRC_URI[sha256sum] = "0bedda25a89948f0904ef30bbf9539912b3ebddb81111cb8608318a237685e55"

inherit sca-description
inherit pypi
inherit setuptools3
inherit native

SCA_TOOL_DESCRIPTION = "multimetric"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-core \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pygments \
    nativesdk-python3-statistics \
"
