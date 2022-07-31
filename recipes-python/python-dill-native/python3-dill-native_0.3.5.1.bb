SUMMARY = "dill extends pythons pickle module"
HOMEPAGE = "https://github.com/uqfoundation/dill"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=61f24e44fc855bde43ed5a1524a37bc4"

PYPI_PACKAGE = "dill"

SRC_URI[sha256sum] = "d75e41f3eff1eee599d738e76ba8f4ad98ea229db8b085318aa2b3333a208c86"

inherit pypi
inherit setuptools3
inherit native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-codecs \
    nativesdk-python3-compression \
    nativesdk-python3-core \
    nativesdk-python3-crypt \
    nativesdk-python3-datetime \
    nativesdk-python3-doctest \
    nativesdk-python3-io \
    nativesdk-python3-json \
    nativesdk-python3-logging \
    nativesdk-python3-math \
    nativesdk-python3-netclient \
    nativesdk-python3-numbers \
    nativesdk-python3-pickle \
    nativesdk-python3-pprint \
    nativesdk-python3-shell \
    nativesdk-python3-stringold \
    nativesdk-python3-tests \
    nativesdk-python3-xml \
"
