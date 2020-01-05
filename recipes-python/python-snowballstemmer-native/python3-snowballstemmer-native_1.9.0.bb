SUMMARY = "Snowball compiler and stemming algorithms"
DESCRIPTION = "Snowball compiler and stemming algorithms"
HOMEPAGE = "https://github.com/snowballstem/snowball"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://../git/COPYING;md5=2750797da77c1d784e7626b3f7d7ff3e"

SRC_URI += "git://github.com/snowballstem/snowball.git;protocol=https"
SRCREV = "69ea0d05cdb5aeb073015912cf8e1d18e1d645a4"

PYPI_PACKAGE = "snowballstemmer"

inherit pypi
inherit native
inherit setuptools3

SRC_URI[md5sum] = "390ee6ab90cd202d6d2dc180f6aaea04"
SRC_URI[sha256sum] = "9f3b9ffe0809d174f7047e121431acf99c89a7040f0ca84f94ba53a498e6d0c9"
