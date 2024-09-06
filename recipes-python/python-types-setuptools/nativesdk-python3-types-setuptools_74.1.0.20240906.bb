SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "e51329b968617885ce45f4089b389c6563f26ebb3de8ef4505917174eed23f79"

inherit pypi
inherit setuptools3
inherit_defer nativesdk

PYPI_PACKAGE = "types-setuptools"
