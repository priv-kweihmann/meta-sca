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

SRC_URI[md5sum] = "50ff54820bebccaff3ef36e73a1c0818"
SRC_URI[sha256sum] = "cbc2ed576998fcf7cd181eeb3ca029e5f0025b264074b4beb57ce780673f8b86"

inherit pypi
inherit setuptools3
inherit native

do_install_append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}