SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "9560df531409e67ac8796e98ffcb6124"
SRC_URI[sha256sum] = "0906e0e7092e060c05de709ad172e1ec1b26aa27fdd4e8093f257890cd881d18"

inherit pypi
inherit setuptools3
inherit native
