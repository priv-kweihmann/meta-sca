SUMMARY = "Use git repo data for building a version number according PEP-440"
HOMEPAGE = "https://github.com/dolfinus/setuptools-git-versioning"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=92e79e3a844e66731724600f3ac9c0d8"

DEPENDS += "\
    python3-packaging-native \
"

PYPI_PACKAGE = "setuptools-git-versioning"

SRC_URI[sha256sum] = "75e3e8c4528fa21ca2417a1f222fdaaa4d2ca7d8536c44affad827c6ec9ba0d4"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-packaging \
"
