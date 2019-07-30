SUMMARY = "Snowball compiler and stemming algorithms"
DESCRIPTION = "Snowball compiler and stemming algorithms"
HOMEPAGE = "https://github.com/snowballstem/snowball"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://COPYING;md5=2750797da77c1d784e7626b3f7d7ff3e"

SRC_URI = "git://github.com/snowballstem/snowball.git;protocol=https"
SRCREV = "69ea0d05cdb5aeb073015912cf8e1d18e1d645a4"

S = "${WORKDIR}/git"

inherit native
