SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "1ec758bbeddf88d52f963fe663beabc2117b6aae73cf3d2902d7dd0df81bd76e"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "types_setuptools"
