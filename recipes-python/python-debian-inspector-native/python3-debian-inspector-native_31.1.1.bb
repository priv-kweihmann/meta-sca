SUMMARY = "Utilities to parse Debian package, copyright and control files"
HOMEPAGE = "https://github.com/nexB/debian-inspector"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 & BSD-3-Clause & MIT"
LIC_FILES_CHKSUM = "\
    file://apache-2.0.LICENSE;md5=86d3f3a95c324c9479bd8986968f4327 \
    file://bsd-new.LICENSE;md5=7bdbf9caf4687a7e5803382ed7f2dcf6 \
    file://mit.LICENSE;md5=8d18be6409468bae48b33b87db85824a \
"

DEPENDS += "\
            python3-attrs-native \
            python3-chardet-native \
            python3-setuptools-scm-native \
           "

PYPI_PACKAGE = "debian-inspector"

SRC_URI[md5sum] = "abdd10afe44580aadd6eb2b02cf9d0c7"
SRC_URI[sha256sum] = "bb216c62b6fb0fd70cd4e4339081115f4a15ef5d6e23f4c4285eadebbcfc7a05"

inherit pypi
inherit pypi-old
inherit python_setuptools_build_meta
inherit_defer native

RDEPENDS:${PN}:class-nativesdk += "\
    nativesdk-python3-attrs \
    nativesdk-python3-chardet \
"
