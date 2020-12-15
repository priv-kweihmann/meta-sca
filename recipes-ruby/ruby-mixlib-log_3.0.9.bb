SUMMARY = "RubyGem: mixlib-log"
DESCRIPTION = "A gem that provides a simple mixin for log functionality"
HOMEPAGE = "https://github.com/chef/mixlib-log"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS = ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "601ca7c39e4ef36c42478fe239aacbb5"
SRC_URI[sha256sum] = "fd6ca2c8075f8085065dffcee0805c5b3f88d643d5c954acdc3282f463a9ad58"

GEM_NAME = "mixlib-log"

inherit rubygems
