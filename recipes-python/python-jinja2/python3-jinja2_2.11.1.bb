SUMMARY = "A small but fast and easy to use template engine written in pure python"
HOMEPAGE = "https://github.com/pallets/jinja"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.rst;md5=5dc88300786f1c214c1e9827a5229462"

DEPENDS += "${PYTHON_PN}-markupsafe"

SRC_URI = "git://github.com/pallets/jinja.git;protocol=https"
SRCREV = "b85283e8464d56ef129fe8969f9abbb77be31be0"
S = "${WORKDIR}/git"

inherit setuptools3

RDEPENDS_${PN} += "${PYTHON_PN}-markupsafe"

BBCLASSEXTEND = "native"
