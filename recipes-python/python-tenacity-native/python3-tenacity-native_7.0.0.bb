SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
             python3-setuptools-scm-native \
             python3-six-native \
            "

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "859490c3426eef020634bd4732ae671a"
SRC_URI[sha256sum] = "5bd16ef5d3b985647fe28dfa6f695d343aa26479a04e8792b9d3c8f49e361ae1"

inherit pypi
inherit setuptools3
inherit native
