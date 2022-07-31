SUMMARY = "Unified diff parsing/metadata extraction library"
HOMEPAGE = "https://github.com/matiasb/python-unidiff"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4c434b08ef42fea235bb019b5e5a97b3"

PYPI_PACKAGE = "unidiff"

SRC_URI[md5sum] = "9a4108b151fff5db4e1ae280ed18835a"
SRC_URI[sha256sum] = "2bbcbc986e1fb97f04b1d7b864aa6002ab02f4d8a996bf03aa6e5a81447d1fc5"

inherit pypi
inherit setuptools3
inherit nativesdk
