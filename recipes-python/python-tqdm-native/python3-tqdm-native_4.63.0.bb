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

SRC_URI[md5sum] = "d82c5f135b75d6471f70d57d02372d76"
SRC_URI[sha256sum] = "1d9835ede8e394bb8c9dcbffbca02d717217113adc679236873eeaac5bc0b3cd"

inherit pypi
inherit setuptools3
inherit native
