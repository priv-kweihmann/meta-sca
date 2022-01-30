SUMMARY = "A python package that provides useful locks"
HOMEPAGE = "https://github.com/harlowja/fasteners"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4476c4be31402271e101d9a4a3430d52"

PYPI_PACKAGE = "fasteners"

SRC_URI[md5sum] = "3822d6ed0cf530d625e574a390f8f6fb"
SRC_URI[sha256sum] = "a9a42a208573d4074c77d041447336cf4e3c1389a256fd3e113ef59cf29b7980"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit native
