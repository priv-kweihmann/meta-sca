SUMMARY = "functions and utilities for handling various things like paths, dates, files and hashes"
HOMEPAGE = "https://github.com/nexB/commoncode"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327"

DEPENDS += "\
    nativesdk-python3-attrs \
    nativesdk-python3-beautifulsoup4 \
    nativesdk-python3-click \
    nativesdk-python3-intbitset \
    nativesdk-python3-requests \
    nativesdk-python3-saneyaml \
    nativesdk-python3-text-unidecode \
    python3-setuptools-scm-native \
    python3-toml-native \
"

SRC_URI = "\
           git://github.com/nexB/commoncode.git;protocol=https;branch=main \
          "
SRCREV = "653225d58dcf5d1f75dbe572cac13f6d84ae755b"

S = "${WORKDIR}/git"

inherit setuptools3
inherit nativesdk

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
