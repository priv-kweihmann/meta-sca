SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "8bd710d62b727ca92c89ab566bdf5128"
SRC_URI[sha256sum] = "72d1a25bf36d2050ceb35b517afe13864865268dfb45910e2e17a84be6cbfeb0"

inherit pypi
inherit setuptools3
inherit nativesdk
