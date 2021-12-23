SUMMARY = "Internationalized Domain Names for Python"
HOMEPAGE = "https://github.com/kjd/idna"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/BSD-3-Clause;md5=550794465ba0ec5312d6919e203a55f9"

PYPI_PACKAGE = "idna"

SRC_URI[md5sum] = "5856306eac5f25db8249e37a4c6ee3e7"
SRC_URI[sha256sum] = "9d643ff0a55b762d5cdb124b8eaa99c66322e2157b69160bc32796e824360e6d"

inherit pypi
inherit setuptools3
inherit native
