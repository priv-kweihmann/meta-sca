SUMMARY = "Use git repo data for building a version number according PEP-440"
HOMEPAGE = "https://github.com/dolfinus/setuptools-git-versioning"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e79e3a844e66731724600f3ac9c0d8"

DEPENDS += "\
    python3-packaging-native \
"

PYPI_PACKAGE = "setuptools-git-versioning"

SRC_URI[sha256sum] = "85b5fbe7bda8e9c24bbd9e587a9d4b91129417f4dd3e11e3c0d5f3f835fc4d4d"

inherit pypi
inherit setuptools3
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-packaging \
"
