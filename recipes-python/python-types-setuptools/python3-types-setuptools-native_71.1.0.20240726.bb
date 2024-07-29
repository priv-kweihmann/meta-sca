SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "85ba28e9461bb1be86ebba4db0f1c2408f2b11115b1966334ea9dc464e29303e"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-setuptools"
