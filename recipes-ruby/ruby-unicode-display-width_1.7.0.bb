SUMMARY = "RubyGem: unicode-display_width"
DESCRIPTION = "[Unicode 13.0.0] Determines the monospace display width of a string using EastAsianWidth.txt, Unicode general category, and other data."
HOMEPAGE = "https://github.com/janlelis/unicode-display_width"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://MIT-LICENSE.txt;md5=201dbe0582b71d9c7252f7decce3c149"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "fc5d1a566bb85b63054e7dcd2b40661a"
SRC_URI[sha256sum] = "cad681071867a4cf52613412e379e39e85ac72b1d236677a2001187d448b231a"

GEM_NAME = "unicode-display_width"

inherit rubygems
