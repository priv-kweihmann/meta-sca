SUMMARY = "The leading native Python SSHv2 protocol library"
HOMEPAGE = "https://github.com/paramiko/paramiko"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://LICENSE;md5=fd0120fc2e9f841c73ac707a30389af5"

PYPI_PACKAGE = "paramiko"

SRC_URI[md5sum] = "df65b3d7e0cfe6a4afe14b570d2ef240"
SRC_URI[sha256sum] = "944a9e5dbdd413ab6c7951ea46b0ab40713235a9c4c5ca81cfe45c6f14fa677b"

inherit pypi
inherit setuptools3
inherit native
