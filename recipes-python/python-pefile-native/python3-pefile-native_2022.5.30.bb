SUMMARY = "Python PE parsing module"
HOMEPAGE = "https://github.com/erocarrera/pefile"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=40774eea6bbb7002b12bba17ee5f6548"

DEPENDS += "\
            python3-future-native \
           "

PYPI_PACKAGE = "pefile"

SRC_URI[md5sum] = "878ca139b770a9820d66d80fb27a2ef0"
SRC_URI[sha256sum] = "a5488a3dd1fd021ce33f969780b88fe0f7eebb76eb20996d7318f307612a045b"

inherit pypi
inherit setuptools3
inherit native
