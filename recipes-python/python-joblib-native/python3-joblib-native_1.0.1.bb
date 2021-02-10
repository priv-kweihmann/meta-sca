SUMMARY = "Lightweight pipelining: using Python functions as pipeline jobs"
HOMEPAGE = "https://github.com/joblib/joblib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=32b289008fb813a27c9025f02b59d03d"

PYPI_PACKAGE = "joblib"

SRC_URI[md5sum] = "9914b330916395c0a1feca54949867a3"
SRC_URI[sha256sum] = "9c17567692206d2f3fb9ecf5e991084254fe631665c450b443761c4186a613f7"

inherit pypi
inherit setuptools3
inherit native
