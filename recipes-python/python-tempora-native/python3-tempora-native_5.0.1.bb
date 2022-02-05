SUMMARY = "Objects and routines pertaining to date and time"
HOMEPAGE = "https://github.com/jaraco/tempora"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7a7126e068206290f3fe9f8d6c713ea6"

DEPENDS += "\
	         python3-jaraco-functools-native \
             python3-pytz-native \
             python3-setuptools-scm-native \
             python3-toml-native \
             python3-wheel-native \
            "

PYPI_PACKAGE = "tempora"

SRC_URI[md5sum] = "262af38f81b97487d12d910bbd6e6420"
SRC_URI[sha256sum] = "cba0f197a64883bf3e73657efbc0324d5bf17179e7769b1385b4d75d26cd9127"

inherit pypi
inherit setuptools3
inherit sca-setuptools-legacy
inherit native
