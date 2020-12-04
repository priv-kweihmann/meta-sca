SUMMARY = "Fast, Extensible Progress Meter"
HOMEPAGE = "https://github.com/tqdm/tqdm"

LICENSE = "MIT & MPL-2.0"
LIC_FILES_CHKSUM = "file://LICENCE;md5=7ea57584e3f8bbde2ae3e1537551de25"

DEPENDS += "\
            python3-setuptools-scm-native \
            python3-toml-native \
            python3-wheel-native \
           "

PYPI_PACKAGE = "tqdm"

SRC_URI[md5sum] = "2046fa572f22c8f08bb72ae7dd2335b9"
SRC_URI[sha256sum] = "5c0d04e06ccc0da1bd3fa5ae4550effcce42fcad947b4a6cafa77bdc9b09ff22"

inherit pypi
inherit native
inherit setuptools3
