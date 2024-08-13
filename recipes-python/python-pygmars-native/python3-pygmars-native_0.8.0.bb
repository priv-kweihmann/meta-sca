SUMMARY = "simple regex-based small language lexers and parsers"
HOMEPAGE = "https://github.com/nexB/pygmars"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    python3-setuptools-scm-native \
"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI:append = " file://0001-setup.cfg-fix-invalid-version-spec.patch"

PYPI_PACKAGE = "pygmars"

SRC_URI[md5sum] = "b459b2d19a8dce4d980fbd55023771cd"
SRC_URI[sha256sum] = "f434c885da52a0dc61a231ce40fb407ad7a92c0e4e4a6a97b51b49095136d35e"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
