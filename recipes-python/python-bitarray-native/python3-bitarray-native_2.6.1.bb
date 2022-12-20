SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5299db65b54d73474e8e47616ba72113"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "0f3b20538cb5268978043050ba7cc675"
SRC_URI[sha256sum] = "8440a5493221f6ed6c4e0d9cb2ba6e4e600a5fb639f66003eaf15b7150a49230"

inherit pypi
inherit setuptools3
inherit native
