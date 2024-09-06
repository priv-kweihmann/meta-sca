SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "437affa76670363db9ffecfa4f153cc6900bf8a7072b3420f3bc07a593f92226"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-psutil"
