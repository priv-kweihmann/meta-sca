SUMMARY = "Distro is an OS platform information API"
DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d2794c0df5b907fdace235a619d80314"

PYPI_PACKAGE = "distro"

SRC_URI[md5sum] = "7ae6b2c8043af47c770bbfedc635c958"
SRC_URI[sha256sum] = "151aeccf60c216402932b52e40ee477a939f8d58898927378a02abbe852c1c39"

inherit pypi 
inherit setuptools3
inherit native
