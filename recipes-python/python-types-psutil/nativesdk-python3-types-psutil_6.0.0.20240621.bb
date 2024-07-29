SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "1be027326c42ff51ebd65255a5146f9dc57e5cf8c4f9519a88b3f3f6a7fcd00e"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

PYPI_PACKAGE = "types-psutil"
