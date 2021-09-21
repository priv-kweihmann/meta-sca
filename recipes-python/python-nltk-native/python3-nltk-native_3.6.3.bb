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

SRC_URI[md5sum] = "4739434f2a69c6accc938ad978586749"
SRC_URI[sha256sum] = "5db64a976e88cef0db9200c7f25aeceba8a86efbe09cc824f01a6d3163f7e937"

inherit pypi
inherit setuptools3
inherit native

do_install:append() {
  # delete pydoc reference
  find ${D} -type f -exec sed -i '/import pydoc/d' {} \;
}