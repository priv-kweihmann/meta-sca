SUMMARY = "Classes Without Boilerplate"
HOMEPAGE = "https://github.com/python-attrs/attrs"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d4ab25949a73fe7d4fdee93bcbdbf8ff"

PYPI_PACKAGE = "attrs"

SRC_URI[md5sum] = "06af884070d9180694becdb106e5cd65"
SRC_URI[sha256sum] = "ef6aaac3ca6cd92904cdd0d83f629a15f18053ec84e6432106f7a4d04ae4f5fb"

inherit pypi
inherit setuptools3
inherit native
