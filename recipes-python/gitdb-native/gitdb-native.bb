SUMMARY = "IO of git-style object databases"
DESCRIPTION = "IO of git-style object databases"
HOMEPAGE = "https://github.com/gitpython-developers/gitdb"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=59e5ecb13339a936eedf83282eaf4528"

PV = "0.6.4"

SRC_URI[md5sum] = "44e4366b8bdfd306b075c3a52c96ae1a"
SRC_URI[sha256sum] = "a3ebbc27be035a2e874ed904df516e35f4a29a778a764385de09de9e0f139658"

DEPENDS += "python3-native"

PYPI_PACKAGE = "gitdb"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/gitdb"

inherit native
