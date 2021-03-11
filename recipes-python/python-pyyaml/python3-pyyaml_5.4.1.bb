SUMMARY = "PyYAML is a YAML parser and emitter for Python"
HOMEPAGE = "https://pyyaml.org"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d8242660a8371add5fe547adf083079"

PYPI_PACKAGE = "PyYAML"

SRC_URI[md5sum] = "46e25294c7efec23d4072ed6a7777f46"
SRC_URI[sha256sum] = "607774cbba28732bfa802b54baa7484215f530991055bb562efbed5b2f20a45e"

inherit pypi
inherit setuptools3

BBCLASSEXTEND = "native"
