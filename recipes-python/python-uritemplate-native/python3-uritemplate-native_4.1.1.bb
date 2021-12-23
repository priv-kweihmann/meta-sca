SUMMARY = "URI templates"
HOMEPAGE = "https://github.com/python-hyper/uritemplate"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0 | BSD-3-Clause"
LIC_FILES_CHKSUM = "\
    file://LICENSE.APACHE;md5=3b83ef96387f14655fc854ddc3c6bd57 \
    file://LICENSE.BSD;md5=6b574ed4b26bdce9060017ce052d0109 \
"

PYPI_PACKAGE = "uritemplate"

SRC_URI[md5sum] = "6a40709eb966d0a57fea08c3f11ff325"
SRC_URI[sha256sum] = "4346edfc5c3b79f694bccd6d6099a322bbeb628dbf2cd86eea55a456ce5124f0"

inherit pypi
inherit setuptools3
inherit native
