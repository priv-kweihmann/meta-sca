SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5299db65b54d73474e8e47616ba72113"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "fcc8c3ef59eb9e6e99bedd4a7e7ff7f7"
SRC_URI[sha256sum] = "56d3f16dd807b1c56732a244ce071c135ee973d3edc9929418c1b24c5439a0fd"

inherit pypi
inherit setuptools3
inherit nativesdk
