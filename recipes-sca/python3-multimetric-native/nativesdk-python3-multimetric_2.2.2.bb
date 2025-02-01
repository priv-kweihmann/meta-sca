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

SRC_URI[sha256sum] = "c7eb28cbf4f369a5def538feee8745615ab289d12f1ad84ca274763c942eff16"

inherit sca-description
inherit pypi
inherit setuptools3
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "multimetric"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-core \
    nativesdk-python3-multiprocessing \
    nativesdk-python3-pygments \
    nativesdk-python3-statistics \
"
