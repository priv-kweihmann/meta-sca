SUMMARY = "Too little variation - A tool to discover code duplication in various languages"
HOMEPAGE = "https://github.com/priv-kweihmann/tlv"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1e0b805e34c99594e846fa46c20d8b9b"

DEPENDS += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"

SRC_URI[sha256sum] = "8f0f423d729620c1690eba558e030eba663f029508d6c1c552edddb7d95df53d"

inherit sca-description
inherit python_setuptools_build_meta
inherit pypi
inherit_defer nativesdk

SCA_TOOL_DESCRIPTION = "tlv"
PYPI_PACKAGE = "tlv"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-chardet \
    nativesdk-python3-pygments \
"
