SUMMARY = "A Python utility / library to sort imports"
HOMEPAGE = "https://github.com/timothycrosley/isort"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=197c46995787b46a2dbf0d519c1754cf"

PYPI_PACKAGE = "isort"

SRC_URI[md5sum] = "6d429f0e5e8618ed4496dea213deaedb"
SRC_URI[sha256sum] = "f65ce5bd4cbc6abdfbe29afc2f0245538ab358c14590912df638033f157d555e"

inherit pypi
inherit setuptools3
inherit native
