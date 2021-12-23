SUMMARY = "general-purpose retrying library"
HOMEPAGE = "https://github.com/jd/tenacity"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=175792518e4ac015ab6696d16c4f607e"

DEPENDS += "\
             python3-setuptools-scm-native \
             python3-six-native \
            "

PYPI_PACKAGE = "tenacity"

SRC_URI[md5sum] = "758aac00f82660afb89f116c1dff1bcb"
SRC_URI[sha256sum] = "43242a20e3e73291a28bcbcacfd6e000b02d3857a9a9fff56b297a27afdc932f"

inherit pypi
inherit setuptools3
inherit native
