SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "91cd0a6e38e02155f6d4bdd699507b51"
SRC_URI[sha256sum] = "15297652e97870f55136bd3c07c697eaed813b24ca8cec7ae08398b026ff03cc"

inherit pypi
inherit setuptools3
inherit native
