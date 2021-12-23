SUMMARY = "Snowball compiler and stemming algorithms"
HOMEPAGE = "https://github.com/snowballstem/snowball"

DEFAULT_PREFERENCE = "${SCA_DEFAULT_PREFERENCE}"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../git/COPYING;md5=2750797da77c1d784e7626b3f7d7ff3e"

# We need to pull git for the LICENSE file but
# have to use pypi release as the project is using
# some weird hand crafted makefile
# requires go, java a.s.o. to build
SRC_URI += "git://github.com/snowballstem/snowball.git;branch=master;protocol=https;name=upstream"

SRC_URI[md5sum] = "4332ddc7bbee0f344a03915b2ad59a54"
SRC_URI[sha256sum] = "09b16deb8547d3412ad7b590689584cd0fe25ec8db3be37788be3810cbf19cb1"

SRCREV = "c70ed64f9d41c1032fba4e962b054f8e9d489a74"

PYPI_PACKAGE = "snowballstemmer"

inherit pypi
inherit setuptools3
inherit native
