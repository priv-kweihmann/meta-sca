SUMMARY = "Annotate AST trees with source code positions"
HOMEPAGE = "https://github.com/gristlabs/asttokens"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI[sha256sum] = "0dcd8baa8d62b0c1d118b399b2ddba3c4aff271d0d7a9e0d4c1681c79035bbc7"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native

PYPI_PACKAGE = "asttokens"
