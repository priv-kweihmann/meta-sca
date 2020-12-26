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

SRC_URI[md5sum] = "e302ddf797723d275f589dfeddf60dbd"
SRC_URI[sha256sum] = "f4f80b96e2ceafea69add7bf971b8403b9cba8fb4451c1220f91c79be4ebd208"

inherit pypi
inherit native
inherit setuptools3
