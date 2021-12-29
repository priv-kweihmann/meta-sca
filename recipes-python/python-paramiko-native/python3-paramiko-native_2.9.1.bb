SUMMARY = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

PYPI_PACKAGE = "paramiko"

SRC_URI[md5sum] = "78fdadd7dae29d868e2cd109210d8686"
SRC_URI[sha256sum] = "a1fdded3b55f61d23389e4fe52d9ae428960ac958d2edf50373faa5d8926edd0"

inherit pypi
inherit setuptools3
inherit native
