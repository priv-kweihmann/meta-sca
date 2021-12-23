SUMMARY = "simple regex-based small language lexers and parsers"
HOMEPAGE = "https://github.com/nexB/pygmars"

DEPENDS += "\
    python3-setuptools-scm-native \
    python3-toml-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=3aad7c78ef152e6bc38d780822c26188"

PYPI_PACKAGE = "pygmars"

SRC_URI[md5sum] = "e2dc47b69cf5e674388799af9e2e0cf0"
SRC_URI[sha256sum] = "49b0169fe05233db19997ec94474cbf4c5369095523416e85c9a0317f8b22c85"

inherit pypi
inherit setuptools3
inherit native
