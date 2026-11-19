SUMMARY = "Use git repo data for building a version number according PEP-440"
HOMEPAGE = "https://github.com/dolfinus/setuptools-git-versioning"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e79e3a844e66731724600f3ac9c0d8"

DEPENDS += "\
    python3-packaging-native \
    python3-wheel-native \
"

PYPI_PACKAGE = "setuptools_git_versioning"

SRC_URI[sha256sum] = "c5b38f3242027cdc53c9eb6c4c8410496afdd2895eb0507115d44dbb98af48e5"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-packaging \
"
