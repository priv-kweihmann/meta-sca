SUMMARY = "Snowball compiler and stemming algorithms"
DESCRIPTION = "Snowball compiler and stemming algorithms"
HOMEPAGE = "https://github.com/snowballstem/snowball"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../git/COPYING;md5=2750797da77c1d784e7626b3f7d7ff3e"

SRC_URI += "git://github.com/snowballstem/snowball.git;protocol=https"
SRCREV = "69ea0d05cdb5aeb073015912cf8e1d18e1d645a4"
UPSTREAM_CHECK_COMMITS = "1"

PYPI_PACKAGE = "snowballstemmer"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "c05ec4a897be3c953c8b8b844c4241d4"
SRC_URI[sha256sum] = "df3bac3df4c2c01363f3dd2cfa78cce2840a79b9f1c2d2de9ce8d31683992f52"
