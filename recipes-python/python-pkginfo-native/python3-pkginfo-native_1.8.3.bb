SUMMARY = "Query metadatdata from sdists / bdists / installed packages"
HOMEPAGE = "https://bazaar.launchpad.net/~tseaver/pkginfo/trunk/files"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=6fc86b61c6077306ca1f5edc8edcc490"

PYPI_PACKAGE = "pkginfo"

SRC_URI[md5sum] = "e67d8f6e37ca37b5512384655bbce760"
SRC_URI[sha256sum] = "a84da4318dd86f870a9447a8c98340aa06216bfc6f2b7bdc4b8766984ae1867c"

inherit pypi
inherit setuptools3
inherit native
