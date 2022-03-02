SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "86b60247386d4711e36e3f60b5c8fe83"
SRC_URI[sha256sum] = "79e5af1ff258bc0fe0bdd6f69bc4ae33935a898e3cbefbbccf22e88a27fa053b"

inherit pypi
inherit setuptools3
inherit native
