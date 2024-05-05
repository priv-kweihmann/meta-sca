SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "543f5cb066ee5f4a3c02573b265ef32d"
SRC_URI[sha256sum] = "83ab366777ea45d58f72593adf35d36ca911ea8bd838483c1823b883a121b0e4"

inherit pypi
inherit setuptools3
inherit nativesdk
