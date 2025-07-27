SUMMARY = "simple regex-based small language lexers and parsers"
HOMEPAGE = "https://github.com/nexB/pygmars"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-setuptools-scm-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

PYPI_PACKAGE = "pygmars"

SRC_URI[md5sum] = "a63a1f3e8705b06555376d94ef5371f2"
SRC_URI[sha256sum] = "de5c6673941eb4c5965f219e64b6638d08237ed76aa7d412ee29819c90a93936"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
