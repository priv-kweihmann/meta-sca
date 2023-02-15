SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7e177def08ec4089aab4e7c68f6c819"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "0168d372d0b2f87fe643abd77ea9e7b4"
SRC_URI[sha256sum] = "7ea42120162bc089a169c58039ce2f0198b5d9bb6cac7c076c3035176335811c"

inherit pypi
inherit setuptools3
inherit native
