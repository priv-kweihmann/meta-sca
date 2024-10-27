SUMMARY = "Typing stubs for psutil"
HOMEPAGE = "https://github.com/python/typeshed"
LICENSE = "Apache-2.0"
# does not provide a license file
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/${LICENSE};md5=89aea4e17d99a7cacdbeed46a0096b10"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"

SRC_URI[sha256sum] = "aa2a6d4accea4b2ef1feee82959d9d9e99568fefa3c872bbc38c21c39dacaf1c"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "types-psutil"
