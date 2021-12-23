SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "ab27973889c6bd8ea625bc2f3a1f6cad"
SRC_URI[sha256sum] = "91bb13b4969514a400679d9ae5e29a6ffad85346087677f8b5e2e036af817447"

inherit pypi
inherit setuptools3
inherit native
