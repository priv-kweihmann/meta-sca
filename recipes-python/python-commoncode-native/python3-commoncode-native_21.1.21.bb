SUMMARY = "functions and utilities for handling various things like paths, dates, files and hashes"
HOMEPAGE = "https://github.com/nexB/commoncode"

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
            python3-typing-native \
           "

SRC_URI = "\
           git://github.com/nexB/commoncode.git;protocol=https;branch=main \
           file://0001-remove-version-binding-for-typing.patch \
          "
SRCREV = "a9b7d7f9ff9f3d9e7c9fa4aa4194ad1ce4c29c6c"

S = "${WORKDIR}/git"

inherit setuptools3
inherit native
