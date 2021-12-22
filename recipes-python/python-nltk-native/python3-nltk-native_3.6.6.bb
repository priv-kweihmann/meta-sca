SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

DEFAULT_PREFERENCE = "-1"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=3b83ef96387f14655fc854ddc3c6bd57"

DEPENDS += "\
             python3-click-native \
             python3-joblib-native \
             python3-regex-native \
             python3-tqdm-native \
           "

PYPI_PACKAGE = "nltk"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "842a160ad5ab00383be19fd8f932951b"
SRC_URI[sha256sum] = "0f8ff4e261c78605bca284e8d2025e562304766156af32a1731f56b396ee364b"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}