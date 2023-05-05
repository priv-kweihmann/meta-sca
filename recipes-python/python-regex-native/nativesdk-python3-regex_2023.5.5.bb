SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "112d22df01c1ec73a462446b0b3b8bc1"
SRC_URI[sha256sum] = "7d76a8a1fc9da08296462a18f16620ba73bcbf5909e42383b253ef34d9d5141e"

inherit pypi
inherit setuptools3
inherit nativesdk
