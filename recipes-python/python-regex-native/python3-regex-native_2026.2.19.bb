SUMMARY = "Alternative regular expression module, to replace re"
HOMEPAGE = "https://bitbucket.org/mrabarnett/mrab-regex"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=7b5751ddd6b643203c31ff873051d069"

PYPI_PACKAGE = "regex"

SRC_URI[md5sum] = "808d30c052ef593b79414e302069c8f5"
SRC_URI[sha256sum] = "6fb8cb09b10e38f3ae17cc6dc04a1df77762bd0351b6ba9041438e7cc85ec310"

inherit pypi
inherit python_setuptools_build_meta
inherit_defer native
