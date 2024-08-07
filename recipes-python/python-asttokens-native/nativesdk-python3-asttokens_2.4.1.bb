SUMMARY = "Annotate AST trees with source code positions"
HOMEPAGE = "https://github.com/gristlabs/asttokens"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e3fc50a88d0a364313df4b21ef20c29e"

SRC_URI[sha256sum] = "b03869718ba9a6eb027e134bfdf69f38a236d681c83c160d510768af11254ba0"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

PYPI_PACKAGE = "asttokens"
