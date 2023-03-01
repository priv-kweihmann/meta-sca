SUMMARY = "provides an object type which efficiently represents an array of booleans"
HOMEPAGE = "https://github.com/ilanschnell/bitarray"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "PSF-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d7e177def08ec4089aab4e7c68f6c819"

PYPI_PACKAGE = "bitarray"

SRC_URI[md5sum] = "62e213806c96d59f3cc27b3c4fe6a860"
SRC_URI[sha256sum] = "f71256a32609b036adad932e1228b66a6b4e2cae6be397e588ddc0babd9a78b9"

inherit pypi
inherit setuptools3
inherit native
