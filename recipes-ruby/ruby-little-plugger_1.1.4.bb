SUMMARY = "RubyGem: little-plugger"
DESCRIPTION = "LittlePlugger is a module that provides Gem based plugin management.By extending your own class or module with LittlePlugger you can easilymanage the loading and initializing of plugins provided by other gems."
HOMEPAGE = "http://gemcutter.org/gems/little-plugger"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://README.rdoc;beginline=30;endline=53;md5=a1c05707b3880cb33c4439dcf796f9b1"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "8b1cf294a87eaabd12d5326bc13d7fe0"
SRC_URI[sha256sum] = "d5f347c00d9d648040ef7c17d6eb09d3d0719adf19ca30d1a3b6fb26d0a631bb"

GEM_NAME = "little-plugger"

inherit rubygems
