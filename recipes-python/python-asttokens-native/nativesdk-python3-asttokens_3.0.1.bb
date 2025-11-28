SUMMARY = "Annotate AST trees with source code positions"
HOMEPAGE = "https://github.com/gristlabs/asttokens"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=3d9b931fa23ab1cacd0087f9e2ee12c0"

SRC_URI[sha256sum] = "71a4ee5de0bde6a31d64f6b13f2293ac190344478f081c3d1bccfcf5eacb0cb7"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "asttokens"
