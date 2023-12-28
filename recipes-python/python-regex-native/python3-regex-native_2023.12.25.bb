SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "3f97f0aef9bf334fe50ae5980b183e68"
SRC_URI[sha256sum] = "29171aa128da69afdf4bde412d5bedc335f2ca8fcfe4489038577d05f16181e5"

inherit pypi
inherit setuptools3
inherit native
