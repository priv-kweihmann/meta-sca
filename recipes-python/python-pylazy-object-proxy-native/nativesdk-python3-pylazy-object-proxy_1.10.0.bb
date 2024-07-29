SUMMARY = "A fast and thorough lazy object proxy for Python"
HOMEPAGE = "https://python-lazy-object-proxy.readthedocs.io/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d606e94f56c21c8e0cdde0b622dcdf57"

DEPENDS += "python3-setuptools-scm-native"

PYPI_PACKAGE = "lazy-object-proxy"

SRC_URI[md5sum] = "d3addb8e8c28c937f037a2ced723251e"
SRC_URI[sha256sum] = "78247b6d45f43a52ef35c25b5581459e85117225408a4128a3daf8bf9648ac69"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

RDEPENDS:${PN}:class-nativesdk += "nativesdk-python3-core"
