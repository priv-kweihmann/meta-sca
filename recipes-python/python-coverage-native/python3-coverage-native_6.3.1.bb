SUMMARY = "Code coverage measurement for Python"
HOMEPAGE = "https://github.com/nedbat/coveragepy"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=2ee41112a44fe7014dce33e26468ba93"

PYPI_PACKAGE = "coverage"

SRC_URI[md5sum] = "cd19dd77fa41ca23bb144d079374d42e"
SRC_URI[sha256sum] = "6c3f6158b02ac403868eea390930ae64e9a9a2a5bbfafefbb920d29258d9f2f8"

inherit pypi
inherit setuptools3
inherit native
