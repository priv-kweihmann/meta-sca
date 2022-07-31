SUMMARY = "Pygments is a syntax highlighting package written in Python"
HOMEPAGE = "http://pygments.org/"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE;md5=98419e351433ac106a24e3ad435930bc"

PYPI_PACKAGE = "Pygments"

SRC_URI[md5sum] = "2137c19d9ac0cc556badc89e746c0e62"
SRC_URI[sha256sum] = "5eb116118f9612ff1ee89ac96437bb6b49e8f04d8a13b514ba26f620208e26eb"

inherit pypi
inherit setuptools3
inherit nativesdk
