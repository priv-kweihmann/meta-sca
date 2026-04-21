SUMMARY = "The Real First Universal Charset Detector"
HOMEPAGE = "https://github.com/ousret/charset_normalizer"

DEPENDS += "python3-setuptools-scm-native"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=48178f3fc1374ad7e830412f812bde05"

PYPI_PACKAGE = "charset-normalizer"

SRC_URI[sha256sum] = "ae89db9e5f98a11a4bf50407d4363e7b09b31e55bc117b4f7d80aab97ba009e5"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

do_configure:prepend() {
    # remove the upper setuptools limit
    # as this is an ever moving target
    sed -i "s#,<=[0-9][0-9].[0-9].[0-9]##" ${S}/pyproject.toml
}
