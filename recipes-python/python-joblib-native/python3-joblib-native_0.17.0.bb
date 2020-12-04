SUMMARY = "Lightweight pipelining: using Python functions as pipeline jobs"
HOMEPAGE = "https://github.com/joblib/joblib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=32b289008fb813a27c9025f02b59d03d"

PYPI_PACKAGE = "joblib"

SRC_URI[md5sum] = "ba702b6e3f6cbee942e7c442e911d523"
SRC_URI[sha256sum] = "9e284edd6be6b71883a63c9b7f124738a3c16195513ad940eae7e3438de885d5"

inherit pypi
inherit native
inherit setuptools3
