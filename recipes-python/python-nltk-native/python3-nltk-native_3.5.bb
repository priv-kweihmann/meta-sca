SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=8a81bec7e22ec0e60acfb4bb52ff583f"

DEPENDS += "\
             python3-click-native \
             python3-joblib-native \
             python3-regex-native \
             python3-tqdm-native \
           "

PYPI_PACKAGE = "nltk"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "2a827c8c8a50b98241c07f2758eb6961"
SRC_URI[sha256sum] = "845365449cd8c5f9731f7cb9f8bd6fd0767553b9d53af9eb1b3abf7700936b35"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}