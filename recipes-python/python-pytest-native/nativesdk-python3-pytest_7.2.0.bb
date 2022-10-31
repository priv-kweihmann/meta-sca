SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd27e41b6550fe0fc45356d1d81ee37c"

DEPENDS += "\
    nativesdk-python3-atomicwrites \
    nativesdk-python3-attrs \
    nativesdk-python3-colorama \
    nativesdk-python3-importlib-metadata \
    nativesdk-python3-more-itertools \
    nativesdk-python3-packaging \
    nativesdk-python3-pathlib2 \
    nativesdk-python3-pluggy \
    nativesdk-python3-py \
    nativesdk-python3-wcwidth \
    python3-setuptools-scm-native \
"

PYPI_PACKAGE = "pytest"

SRC_URI[md5sum] = "49decbade40109f9c6970df60c22a230"
SRC_URI[sha256sum] = "c4014eb40e10f11f355ad4e3c2fb2c6c6d1919c73f3b5a433de4708202cade59"

inherit pypi
inherit setuptools3
inherit nativesdk

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-atomicwrites \
    nativesdk-python3-attrs \
    nativesdk-python3-colorama \
    nativesdk-python3-importlib-metadata \
    nativesdk-python3-more-itertools \
    nativesdk-python3-packaging \
    nativesdk-python3-pathlib2 \
    nativesdk-python3-pluggy \
    nativesdk-python3-py \
    nativesdk-python3-wcwidth \
"
