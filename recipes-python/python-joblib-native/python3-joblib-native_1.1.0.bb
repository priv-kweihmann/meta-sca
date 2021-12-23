SUMMARY = "Lightweight pipelining: using Python functions as pipeline jobs"
HOMEPAGE = "https://github.com/joblib/joblib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2e481820abf0a70a18011a30153df066"

PYPI_PACKAGE = "joblib"

SRC_URI[md5sum] = "d8fb897e6cbb1359738ed7b1739be389"
SRC_URI[sha256sum] = "4158fcecd13733f8be669be0683b96ebdbbd38d23559f54dca7205aea1bf1e35"

inherit pypi
inherit setuptools3
inherit native
