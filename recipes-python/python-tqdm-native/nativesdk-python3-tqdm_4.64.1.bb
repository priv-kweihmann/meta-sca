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

SRC_URI[md5sum] = "5822af464d77ea156ad1167c23e1bdac"
SRC_URI[sha256sum] = "5f4f682a004951c1b450bc753c710e9280c5746ce6ffedee253ddbcbf54cf1e4"

inherit pypi
inherit setuptools3
inherit nativesdk
