SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7e177def08ec4089aab4e7c68f6c819"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "e2ff6069b356eeae26cea71a1b47470f"
SRC_URI[sha256sum] = "90bac83ba6c37ab5048b43e07eba7d0de12f301ad6641633656fa269618a7301"

inherit pypi
inherit setuptools3
inherit native
