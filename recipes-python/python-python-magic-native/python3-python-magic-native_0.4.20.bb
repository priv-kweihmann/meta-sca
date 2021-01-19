SUMMARY = "A python wrapper for libmagic"
HOMEPAGE = "https://github.com/ahupp/python-magic"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61495c152d794e6be5799a9edca149e3"

DEPENDS += "file-native"

PYPI_PACKAGE = "python-magic"

SRC_URI[md5sum] = "f692bcbea129fb09c29464f1e89d7283"
SRC_URI[sha256sum] = "0cc52ccad086c377b9194014e3dbf98d94b194344630172510a6a3e716b47801"

inherit pypi
inherit native
inherit setuptools3
