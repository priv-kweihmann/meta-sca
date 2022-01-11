SUMMARY = "A flake8 plugin to help you write better list/set/dict comprehensions"
HOMEPAGE = "https://github.com/adamchainz/flake8-comprehensions"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=0699983c8f8199c37bee38509aacbbc6"

DEPENDS += "python3-flake8-native"

PYPI_PACKAGE = "flake8-comprehensions"

SRC_URI[md5sum] = "22252a66ed0bd86eff53a45f399ca2f9"
SRC_URI[sha256sum] = "8e108707637b1d13734f38e03435984f6b7854fa6b5a4e34f93e69534be8e521"

inherit pypi
inherit setuptools3
inherit native
