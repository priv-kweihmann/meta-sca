SUMMARY = "Python package for creating and manipulating graphs and networks"
HOMEPAGE = "https://github.com/networkx/networkx"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=a24ea029adac8935699bf69b2e38c728"

DEPENDS += "python3-decorator-native"

PYPI_PACKAGE = "networkx"

SRC_URI[md5sum] = "bded9f095b2757f6ce11531a6f874d9d"
SRC_URI[sha256sum] = "109cd585cac41297f71103c3c42ac6ef7379f29788eb54cb751be5a663bb235a"

do_install:append() {
    # according to https://github.com/networkx/networkx/issues/4718#issuecomment-813034594
    # it's safe to use decorator 5.0.5+
    # can be likely removed with a future update of networkx
    find ${D} -type f -exec sed -i "s#decorator<5.*#decorator#g" {} \;
}

inherit pypi
inherit setuptools3
inherit native
