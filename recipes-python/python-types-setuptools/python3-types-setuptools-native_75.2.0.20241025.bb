SUMMARY = "Typing stubs for setuptools"
HOMEPAGE = "https://github.com/python/typeshed"

LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "2949913a518d5285ce00a3b7d88961c80a6e72ffb8f3da0a3f5650ea533bd45e"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-setuptools"
