SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "92cbc053801c4990545ce74edc4ac63c"
SRC_URI[sha256sum] = "2826a006b68acfd3ed5074433caafe21d7f9d026eb82cb856724a4a893a70915"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
