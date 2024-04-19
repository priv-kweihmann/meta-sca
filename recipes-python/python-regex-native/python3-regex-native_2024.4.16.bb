SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "1887cc71be6feacb692246944be9f59b"
SRC_URI[sha256sum] = "fa454d26f2e87ad661c4f0c5a5fe4cf6aab1e307d1b94f16ffdfcb089ba685c0"

inherit pypi
inherit setuptools3
inherit native
