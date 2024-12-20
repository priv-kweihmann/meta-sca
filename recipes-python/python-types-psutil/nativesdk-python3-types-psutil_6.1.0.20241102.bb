SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "8cbe086b9c29f5c0aa55c4422498c07a8e506f096205761dba088905198551dc"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

PYPI_PACKAGE = "types-psutil"
