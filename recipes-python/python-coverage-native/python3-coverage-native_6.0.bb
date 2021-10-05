SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "03af650649835e5eb815a5f4250660ea"
SRC_URI[sha256sum] = "17983f6ccc47f4864fd16d20ff677782b23d1207bf222d10e4d676e4636b0872"

inherit pypi
inherit setuptools3
inherit native
