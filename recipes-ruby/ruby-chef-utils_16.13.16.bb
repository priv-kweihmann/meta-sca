SUMMARY = "RubyGem: chef-utils"
DESCRIPTION = "Basic utility functions for Core Chef Infra development"
HOMEPAGE = "https://github.com/chef/chef/tree/master/chef-utils"

LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE;md5=8f7bb094c7232b058c7e9f2e431f389c"

DEPENDS += ""
RDEPENDS_${PN} += ""

SRC_URI[md5sum] = "c45ac30eabd87e3c03cd7493d5a86490"
SRC_URI[sha256sum] = "5e9229007c77f0064f675c74286feffc639c0d1b96f90899fdd03894dab09300"

GEM_NAME = "chef-utils"

inherit rubygems
