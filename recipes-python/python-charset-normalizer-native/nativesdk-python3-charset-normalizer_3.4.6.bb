SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48178f3fc1374ad7e830412f812bde05"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "1ae6b62897110aa7c79ea2f5dd38d1abca6db663687c0b1ad9aed6f6bae3d9d6"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer nativesdk
