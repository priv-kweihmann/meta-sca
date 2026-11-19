SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "d677119c44fb80cc9be41d8ac731f08bf89974bb1daa49b6688665a9d7224f42"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "types_psutil"
