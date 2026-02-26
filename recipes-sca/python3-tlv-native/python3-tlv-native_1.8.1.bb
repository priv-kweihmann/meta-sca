SUMMARY = "Too little variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/tlv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    python3-chardet-native \
    python3-pygments-native \
"

SRC_URI[sha256sum] = "72ff92ed1c7d6690ee9ad337f2ccec902ff84c85b63a7963a5374e3a692b3cd6"

inherit sca-description
inherit python_setuptools_build_meta
inherit pypi
inherit_defer native

SCA_TOOL_DESCRIPTION = "tlv"
PYPI_PACKAGE = "tlv"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"
