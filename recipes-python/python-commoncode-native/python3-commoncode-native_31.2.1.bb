SUMMARY = "functions and utilities for handling various things like paths, dates, files and hashes"
HOMEPAGE = "https://github.com/nexB/commoncode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
            python3-attrs-native \
            python3-beautifulsoup4-native \
            python3-click-native \
            python3-intbitset-native \
            python3-requests-native \
            python3-saneyaml-native \
            python3-setuptools-scm-native \
            python3-text-unidecode-native \
            python3-toml-native \
           "

SRC_URI = "\
           git://github.com/nexB/commoncode.git;protocol=https;branch=main \
          "
SRCREV = "b1183542d374e8f6c87e4c5390f493a8f5b7ac76"

UNPACKDIR ??= "${WORKDIR}/sources-unpack"
S = "${UNPACKDIR}/git"

inherit setuptools3
inherit_defer native

PIP_INSTALL_PACKAGE = "commoncode"

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-beautifulsoup4 \
    nativesdk-python3-click \
    nativesdk-python3-intbitset \
    nativesdk-python3-requests \
    nativesdk-python3-saneyaml \
    nativesdk-python3-text-unidecode \
"
