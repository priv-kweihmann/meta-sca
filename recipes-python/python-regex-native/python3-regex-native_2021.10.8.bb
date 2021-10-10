SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "2aa345ecaf1189edd32a599a5e005b91"
SRC_URI[sha256sum] = "26895d7c9bbda5c52b3635ce5991caa90fbb1ddfac9c9ff1c7ce505e2282fb2a"

inherit pypi
inherit setuptools3
inherit native
