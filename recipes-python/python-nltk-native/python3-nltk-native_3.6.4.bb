SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

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

SRC_URI[md5sum] = "fb2e55be65cd313682bf315631fa309d"
SRC_URI[sha256sum] = "dd7e8012af25737e6aa7bc26568a319508dca789f13e62afa09798dccc7798b5"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}