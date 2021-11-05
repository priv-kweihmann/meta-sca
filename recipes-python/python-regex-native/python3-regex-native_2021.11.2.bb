SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "759112e74407c44a97c08d828bf5e597"
SRC_URI[sha256sum] = "5e85dcfc5d0f374955015ae12c08365b565c6f1eaf36dd182476a4d8e5a1cdb7"

inherit pypi
inherit setuptools3
inherit native
