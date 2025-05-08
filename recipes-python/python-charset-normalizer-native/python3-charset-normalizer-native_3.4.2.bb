SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48178f3fc1374ad7e830412f812bde05"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "5baececa9ecba31eff645232d59845c07aa030f0c81ee70184a90d35099a0e63"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
