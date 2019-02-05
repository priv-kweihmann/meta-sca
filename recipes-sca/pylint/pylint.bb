SUMMARY = "pylint"
DESCRIPTION = "Static code analyser for python files"
HOMEPAGE = "https://github.com/PyCQA/pylint"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=4325afd396febcb659c36b49533135d4"

PV = "1.8.1"

SRC_URI[md5sum] = "b7cca873fb60d420a4db8d3bfa4824b1"
SRC_URI[sha256sum] = "3035e44e37cd09919e9edad5573af01d7c6b9c52a0ebb4781185ae7ab690458b"

RDEPENDS_${PN} += "python3-native \
                   pyisort-native \
                   pyastroids-native \
                   pysix-native"
DEPENDS += "python3-native \
            pyisort-native \
            pyastroids-native \
            pysix-native \
            pytest-runner-native"

PYPI_PACKAGE = "pylint"

inherit setuptools3
inherit pypi

FILES_${PN} += "${datadir}/pylint"

BBCLASSEXTEND = "native nativesdk"
