SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "ca1daefad796c5365fdbce055a21afb8"
SRC_URI[sha256sum] = "8cbaf8ceb88f96ae2356d01b9adf5e6306fa42fa6f7eab6b97794e37c959ac26"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk
