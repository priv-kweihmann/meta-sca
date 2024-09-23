SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "12f12a165e7ed383f31def705e5c0fa1c26215dd466b0af34bd042f7d5331f55"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-setuptools"
