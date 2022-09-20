SUMMARY = "Lightweight pipelining: using Python functions as pipeline jobs"
HOMEPAGE = "https://github.com/joblib/joblib"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2e481820abf0a70a18011a30153df066"

PYPI_PACKAGE = "joblib"

SRC_URI[md5sum] = "928a19e66a10f6cda32fb004440c70fb"
SRC_URI[sha256sum] = "e1cee4a79e4af22881164f218d4311f60074197fb707e082e803b61f6d137018"

inherit pypi
inherit setuptools3
inherit native
