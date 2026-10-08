SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "0f123655f44390a15ec62c9fa30b57f6dafe53014524d28b62cab1edbc303059"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "types_setuptools"
