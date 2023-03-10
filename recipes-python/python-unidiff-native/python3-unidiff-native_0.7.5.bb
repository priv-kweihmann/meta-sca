SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "34ffc3f9fdc4763d4d98840381556cde"
SRC_URI[sha256sum] = "2e5f0162052248946b9f0970a40e9e124236bf86c82b70821143a6fc1dea2574"

inherit pypi
inherit setuptools3
inherit native
