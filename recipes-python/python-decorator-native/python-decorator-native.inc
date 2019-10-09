SUMMARY = "Better living through Python with decorators"

HOMEPAGE = "https://github.com/micheles/decorator"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=be2fd2007972bf96c08af3293d728b22"

PYPI_PACKAGE = "decorator"

inherit pypi

FILES_${PN} += "${datadir}/decorator"

inherit native
