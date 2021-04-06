SUMMARY = "RubyGem: rexml"
DESCRIPTION = "An XML toolkit for Ruby"
HOMEPAGE = "https://github.com/ruby/rexml"

LICENSE = "BSD-2-Clause"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=19aaf65c88a40b508d17ae4be539c4b5"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "e8685a8e5a4b6bb8eb810ea1477a99dc"
SRC_URI[sha256sum] = "a33c3bf95fda7983ec7f05054f3a985af41dbc25a0339843bd2479e93cabb123"

GEM_NAME = "rexml"

inherit rubygems
