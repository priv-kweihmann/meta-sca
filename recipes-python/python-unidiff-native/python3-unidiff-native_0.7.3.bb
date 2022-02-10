SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "5ea66091b7cf13d2e1eb2c2b1bab6a3a"
SRC_URI[sha256sum] = "d5f2e53a9a00db3224a8c36349b5380e0e22d1aec6c694b14fb9483ee93c6205"

inherit pypi
inherit setuptools3
inherit native
