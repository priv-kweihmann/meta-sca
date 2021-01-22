SUMMARY = "Snowball compiler and stemming algorithms"
HOMEPAGE = "https://github.com/snowballstem/snowball"

LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../git/COPYING;md5=2750797da77c1d784e7626b3f7d7ff3e"

# We need to pull git for the LICENSE file but
# have to use pypi release as the project is using
# some weird hand crafted makefile
# requires go, java a.s.o. to build
SRC_URI += "git://github.com/snowballstem/snowball.git;protocol=https;name=upstream"

SRC_URI[md5sum] = "fad6a525534b2da052d1fa820a615100"
SRC_URI[sha256sum] = "e997baa4f2e9139951b6f4c631bad912dfd3c792467e2f03d7239464af90e914"

SRCREV = "c70ed64f9d41c1032fba4e962b054f8e9d489a74"

PYPI_PACKAGE = "snowballstemmer"

inherit pypi
inherit native
inherit setuptools3
