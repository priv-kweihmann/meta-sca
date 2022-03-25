SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=1672e2674934fd93a31c09cf17f34100"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "e3a8fae515c65eef29c7eaf44b1e6998"
SRC_URI[sha256sum] = "4230a49119a416c88cc47d0d2d32d5d90f1a282d5e497d49801950704e49863d"

inherit pypi
inherit setuptools3
inherit native
