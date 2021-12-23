SUMMARY = "Pretty-print tabular data"
HOMEPAGE = "https://github.com/astanin/python-tabulate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fad5a39bdfe452b13775adda41023ba7"

PYPI_PACKAGE = "tabulate"

SRC_URI[sha256sum] = "eb1d13f25760052e8931f2ef80aaf6045a6cceb47514db8beab24cded16f13a7"

inherit pypi
inherit setuptools3
inherit native
