SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5299db65b54d73474e8e47616ba72113"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "ff1232af8d5abcd1d8bab9b316b755e1"
SRC_URI[sha256sum] = "8d38f60751008099a659d5acfb35ef4150183effd5b2bfa6c10199270ddf4c9c"

inherit pypi
inherit setuptools3
inherit native
