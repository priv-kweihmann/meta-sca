SUMMARY = "Natural Language Toolkit"
HOMEPAGE = "https://github.com/nltk/nltk"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d273d63619c9aeaf15cdaf76422c4f87"

DEPENDS += "\
             python3-click-native \
             python3-joblib-native \
             python3-regex-native \
             python3-tqdm-native \
           "

PYPI_PACKAGE = "nltk"
PYPI_PACKAGE_EXT = "zip"

SRC_URI[md5sum] = "fbb8e6fce2d614b65bacfeb9880bcb44"
SRC_URI[sha256sum] = "d6507d6460cec76d70afea4242a226a7542f85c669177b9c7f562b7cf1b05502"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}