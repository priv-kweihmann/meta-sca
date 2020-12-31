SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 13.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=201dbe0582b71d9c7252f7decce3c149"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "62eef99c3236b28f2f49abd6653b7133"
SRC_URI[sha256sum] = "55ec39f2a0bb8c8c3f0480200b28edbedd70473c27b84c5359531a89985d34ae"

GEM_NAME = "unicode-display_width"

inherit rubygems
