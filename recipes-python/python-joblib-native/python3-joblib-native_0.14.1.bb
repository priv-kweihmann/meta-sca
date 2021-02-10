SUMMARY = "Lightweight pipelining: using Python functions as pipeline jobs"
HOMEPAGE = "https://github.com/joblib/joblib"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=32b289008fb813a27c9025f02b59d03d"

PYPI_PACKAGE = "joblib"

SRC_URI[md5sum] = "182e6bc65681ea49a12775fdc86a8e24"
SRC_URI[sha256sum] = "0630eea4f5664c463f23fbf5dcfc54a2bc6168902719fa8e19daf033022786c8"

inherit pypi
inherit setuptools3
inherit native
