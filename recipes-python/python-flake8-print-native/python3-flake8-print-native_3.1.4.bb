SUMMARY = "print statement checker plugin for flake8"
HOMEPAGE = "https://github.com/jbkahn/flake8-print"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENCE;md5=5062d59f7c370e1fae388e102ca06095"

DEPENDS += "\
            ${PYTHON_PN}-flake8-native \
            ${PYTHON_PN}-pycodestyle-native \
            ${PYTHON_PN}-six-native \
            "

SRC_URI += "git://github.com/JBKahn/flake8-print.git;protocol=https;tag=${PV}"

S = "${WORKDIR}/git"

inherit native
inherit setuptools3
