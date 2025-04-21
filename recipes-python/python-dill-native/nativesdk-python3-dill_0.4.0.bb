SUMMARY = "dill extends pythons pickle module"
HOMEPAGE = "https://github.com/uqfoundation/dill"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=ed5ea77287d7d542949d6dd0bc288ac0"

PYPI_PACKAGE = "dill"

SRC_URI[sha256sum] = "0633f1d2df477324f53a895b02c901fb961bdbf65a17122586ea7019292cbcf0"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer nativesdk

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
