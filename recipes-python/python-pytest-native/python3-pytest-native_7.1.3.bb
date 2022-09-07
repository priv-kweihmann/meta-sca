SUMMARY = "Easy to write small tests"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support complex functional testing"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=bd27e41b6550fe0fc45356d1d81ee37c"

DEPENDS += "\
            python3-atomicwrites-native \
            python3-attrs-native \
            python3-colorama-native \
            python3-importlib-metadata-native \
            python3-more-itertools-native \
            python3-packaging-native \
            python3-pathlib2-native \
            python3-pluggy-native \
            python3-py-native \
            python3-setuptools-scm-native \
            python3-wcwidth-native \
           "

PYPI_PACKAGE = "pytest"

SRC_URI[md5sum] = "c4de3e192e5bb4b39deada36cc2f393a"
SRC_URI[sha256sum] = "4f365fec2dff9c1162f834d9f18af1ba13062db0c708bf7b946f8a5c76180c39"


inherit pypi
inherit setuptools3
inherit native

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
