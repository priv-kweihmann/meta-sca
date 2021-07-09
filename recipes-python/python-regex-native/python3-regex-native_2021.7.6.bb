SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "82cd2a60189dafe65fdae71fd86f2006"
SRC_URI[sha256sum] = "8394e266005f2d8c6f0bc6780001f7afa3ef81a7a2111fa35058ded6fce79e4d"

inherit pypi
inherit setuptools3
inherit native
