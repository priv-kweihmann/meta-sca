SUMMARY = "Read metadata from Python packages"
HOMEPAGE = "https://importlib-metadata.readthedocs.io/en/latest/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=e88ae122f3925d8bde8319060f2ddb8e"

DEPENDS += "python3-zipp-native"

PYPI_PACKAGE = "importlib_metadata"

UPSTREAM_CHECK_REGEX ?= "/importlib-metadata/(?P<pver>(\d+[\.\-_]*)+)"

SRC_URI[md5sum] = "2b476f505bc3bf934e2b2221d4fb4a44"
SRC_URI[sha256sum] = "951f0d8a5b7260e9db5e41d429285b5f451e928479f19d80818878527d36e95e"

inherit pypi
inherit setuptools3
inherit native
