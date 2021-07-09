SUMMARY = "Foreign Function Interface for Python calling C code"
HOMEPAGE = "https://bitbucket.org/cffi/cffi/src/default/"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=5677e2fdbf7cdda61d6dd2b57df547bf"

DEPENDS += "\
            python3-pycparser-native \
            libffi-native \
           "

RDEPENDS_${PN}_class-target += "\
                                python3-pycparser \
                                libffi \
                               "

PYPI_PACKAGE = "cffi"

SRC_URI[md5sum] = "5c118a18ea897df164dbff67a32876fc"
SRC_URI[sha256sum] = "c9a875ce9d7fe32887784274dd533c57909b7b1dcadcc128a2ac21331a9765dd"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
