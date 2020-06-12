SUMMARY = "A common base representation of python source code for pylint and other projects"
HOMEPAGE = "https://github.com/PyCQA/astroid"

LICENSE = "LGPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS += "\
            ${PYTHON_PN}-native \
            ${PYTHON_PN}-pylazy-object-proxy-native \
            ${PYTHON_PN}-pytest-runner-native \
            ${PYTHON_PN}-typed-ast-native \
            ${PYTHON_PN}-wrapt-native \
            "

SRC_URI_append = " file://ae3a2d8cf263f39651139891916bc6f5797c9713.patch"

PYPI_PACKAGE = "astroid"

SRC_URI[md5sum] = "b0ab3129a634e7210f7b3647fb81c215"
SRC_URI[sha256sum] = "4c17cea3e592c21b6e222f673868961bad77e1f985cb1694ed077475a89229c1"

inherit pypi
inherit native
inherit setuptools3

# Temporary fix, till new astroid version will be available
# This fix relaxes the requirements for wrapt like done upstream
# with https://github.com/PyCQA/astroid/commit/597c044378bdcac0e02205e151f180f85a40a729
do_configure_prepend() {
    sed -i 's#wrapt==1.11.\*#wrapt~=1.11#g' ${S}/astroid.egg-info/requires.txt
    sed -i 's#wrapt==1.11.\*#wrapt~=1.11#g' ${S}/astroid/__pkginfo__.py
}
