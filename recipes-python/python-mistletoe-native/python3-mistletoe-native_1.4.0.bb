SUMMARY = "A fast, extensible Markdown parser in pure Python."
HOMEPAGE = "https://github.com/miyuchina/mistletoe"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=57943b291c8e54f0e5b648dc17a6f76c"

DEPENDS += "python3-pygments-native"

SRC_URI[sha256sum] = "1630f906e5e4bbe66fdeb4d29d277e2ea515d642bb18a9b49b136361a9818c9d"

inherit pypi
inherit setuptools3
inherit_defer native

PYPI_PACKAGE = "mistletoe"
