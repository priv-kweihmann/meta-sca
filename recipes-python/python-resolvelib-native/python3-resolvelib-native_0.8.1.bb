SUMMARY = "Resolve abstract dependencies into concrete ones"
HOMEPAGE = "https://github.com/sarugaku/resolvelib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "ISC"
LIC_FILES_CHKSUM = "file://LICENSE;md5=78e1c0248051c32a38a7f820c30bd7a5"

PYPI_PACKAGE = "resolvelib"

SRC_URI[md5sum] = "fbd5fbcac181644333390ea6a71c4edc"
SRC_URI[sha256sum] = "c6ea56732e9fb6fca1b2acc2ccc68a0b6b8c566d8f3e78e0443310ede61dbd37"

inherit pypi
inherit setuptools3
inherit native
