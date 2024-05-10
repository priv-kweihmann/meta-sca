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

SRC_URI[sha256sum] = "a12bb18aea0a5cb3d71d2368c10ee46185c4de615636de12fb0fce164563c66c"

inherit sca-description
inherit pypi
inherit setuptools3
inherit nativesdk
SCA_TOOL_DESCRIPTION = "multimetric"
RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-core \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pygments \
    nativesdk-python3-statistics \
"
