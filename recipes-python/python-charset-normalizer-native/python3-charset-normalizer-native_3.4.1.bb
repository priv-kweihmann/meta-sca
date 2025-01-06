SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48178f3fc1374ad7e830412f812bde05"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "44251f18cd68a75b56585dd00dae26183e102cd5e0f9f1466e6df5da2ed64ea3"

inherit pypi
inherit pypi-old
inherit setuptools3
inherit_defer native
