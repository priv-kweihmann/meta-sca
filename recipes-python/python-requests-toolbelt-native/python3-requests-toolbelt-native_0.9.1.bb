SUMMARY = "A utility belt for advanced users of python-requests"
HOMEPAGE = "https://github.com/requests/toolbelt"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=71760e0f1dda8cff91b0bc9246caf571"

DEPENDS += "\
            python3-requests-native \
           "

PYPI_PACKAGE = "requests-toolbelt"

SRC_URI[md5sum] = "b1509735c4b4cf95df2619facbc3672e"
SRC_URI[sha256sum] = "968089d4584ad4ad7c171454f0a5c6dac23971e9472521ea3b6d49d610aa6fc0"

inherit pypi
inherit setuptools3
inherit native
