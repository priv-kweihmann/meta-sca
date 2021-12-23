SUMMARY = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

PYPI_PACKAGE = "paramiko"

SRC_URI[md5sum] = "e6fc50032d3c3363531462516a657acb"
SRC_URI[sha256sum] = "85b1245054e5d7592b9088cc6d08da22445417912d3a3e48138675c7a8616438"

inherit pypi
inherit setuptools3
inherit native
