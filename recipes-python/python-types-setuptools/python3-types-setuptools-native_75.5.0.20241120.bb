SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "d3c7e95b0598bf87fede29b3b57b19f5cdcd62a85b9298a7b30f8343f6f21c4f"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-setuptools"
