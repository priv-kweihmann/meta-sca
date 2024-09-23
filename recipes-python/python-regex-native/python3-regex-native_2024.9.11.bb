SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "a544771359e2c977578297506de829eb"
SRC_URI[sha256sum] = "6c188c307e8433bcb63dc1915022deb553b4203a70722fc542c363bf120a01fd"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
