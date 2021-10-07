SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "4f3214adff172e555f0c2c8ea5032b9e"
SRC_URI[sha256sum] = "3490ff6dbf3f7accf0750136ed60ae1f487bccc1f097740e3b21262bc9c89854"

inherit pypi
inherit setuptools3
inherit native
