SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7e177def08ec4089aab4e7c68f6c819"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "a462c1519b2f8859c6e52cca9d49d714"
SRC_URI[sha256sum] = "00bb723cf7059e30b328b6568b3b75c0f652ec9228d959d54e997852a31a31a2"

inherit pypi
inherit setuptools3
inherit native
